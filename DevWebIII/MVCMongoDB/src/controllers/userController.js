var User = require("../models/userModel");

exports.getUser = async function (req, res) {
  /* 
        #swagger.tags = ['User']
        #swagger.summary = 'Retorna a lista de usuários'
        #swagger.responses[200] = {
            description: 'Lista de usuários retornada com sucesso'
        }
        #swagger.responses[500] = {
            description: 'Erro ao buscar a lista de usuários'
        }
    */
  try {
    const result = await User.find();
    res.status(200).json(result);
  } catch (err) {
    res.status(500).json(err);
  }
};

exports.create = function (req, res) {
  /* 
        #swagger.tags = ['User']
        #swagger.summary = 'Cria um novo usuário'
        #swagger.requestBody = {
            required: true,
            content: {
                'application/json': {
                    schema: {
                        type: 'object',
                        properties: {
                            name: { type: 'string' },
                            age: { type: 'integer' }
                        }
                    }
                }
            }
        }
        #swagger.responses[201] = {
            description: 'Usuário criado com sucesso'
        }
        #swagger.responses[500] = {
            description: 'Erro ao cadastrar o usuário'
        }
    */
  let user = new User({
    name: req.body.name,
    age: req.body.age,
  });
  user
    .save()
    .then(savedUser => res.status(201).send(savedUser.toJSON()))
    .catch((err) => {
      res
        .status(500)
        .send({ message: `${err.message} - falha ao cadastrar usuário.` });
    });
};

exports.details = async function (req, res) {
  /* 
        #swagger.tags = ['User']
        #swagger.summary = 'Retorna os detalhes de um usuário específico'
        #swagger.parameters['id'] = {
            description: 'ID do usuário',
            required: true,
            type: 'string'
        }
        #swagger.responses[200] = {
            description: 'Usuário encontrado'
        }
        #swagger.responses[404] = {
            description: 'Usuário não encontrado'
        }
        #swagger.responses[500] = {
            description: 'Erro ao buscar usuário'
        }
    */
  try {
    const user = await User.findById(req.params.id);
    res.status(200).json(user);
  } catch (err) {
    res.status(500).json(err);
  }
};

exports.updateUser = async function (req, res) {
  /* 
        #swagger.tags = ['User']
        #swagger.summary = 'Atualiza um usuário existente'
        #swagger.parameters['id'] = {
            description: 'ID do usuário',
            required: true,
            type: 'string'
        }
        #swagger.requestBody = {
            required: true,
            content: {
                'application/json': {
                    schema: {
                        type: 'object',
                        properties: {
                            name: { type: 'string' },
                            age: { type: 'integer' }
                        }
                    }
                }
            }
        }
        #swagger.responses[200] = {
            description: 'Usuário atualizado com sucesso'
        }
        #swagger.responses[404] = {
            description: 'Usuário não encontrado'
        }
        #swagger.responses[500] = {
            description: 'Erro ao atualizar usuário'
        }
    */
  try {
    //findByIdAndUpdate(id, dados, {new: true} (retorna o documento atualizado em vez do original))
    const user = await User.findByIdAndUpdate(req.params.id, req.body, {
      new: true,
    });
    if (!user) {
      return res.status(404).json({ message: `Usuário não encontrado` });
    }
    res.status(200).json(user);
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
};

exports.deleteUser = async function (req, res) {
  /* 
        #swagger.tags = ['User']
        #swagger.summary = 'Remove um usuário existente'
        #swagger.parameters['id'] = {
            description: 'ID do usuário',
            required: true,
            type: 'string'
        }
        #swagger.responses[200] = {
            description: 'Usuário deletado com sucesso'
        }
        #swagger.responses[404] = {
            description: 'Usuário não encontrado'
        }
        #swagger.responses[500] = {
            description: 'Erro ao deletar usuário'
        }
    */
  try {
    const user = await User.findByIdAndDelete(req.params.id);
    if (!user) {
      return res.status(404).json({ message: `Usuário não encontrado` });
    }
    res.status(200).json({ message: `Usuário deletado com sucesso` });
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
};
