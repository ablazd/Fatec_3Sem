const adminModel = require('../models/adminModel')

exports.getAdmin = (req, res) => {
    /* 
        #swagger.tags = ['Admin']
        #swagger.summary = 'Renderiza a tela do Administrador'
        #swagger.description = 'Esse endpoint mostra a tela do administrador e todos cadastros.'
        #swagger.responses[200] = {
            description: 'Tela carregada com sucesso'
        }
    */
    let registers = adminModel.getRegisterList();
    res.render('adminView', { registers });
}

exports.deleteRegister = ((req, res) => {
    /* 
        #swagger.tags = ['Admin']
        #swagger.summary = 'Deleta um cadastro'
        #swagger.description = 'Esse endpoint deleta um cadastro com base no email fornecido no corpo da requisição.'
        #swagger.responses[200] = {
            description: 'Cadastro deletado com sucesso'
        }
        #swagger.responses[404] = {
            description: 'Cadastro não encontrado'
        }
    */
    const email = req.body.email;
    adminModel.deleteRegister(email);
    res.redirect('/admin');
})

exports.countRegisters = ((req, res) => {
    /* 
        #swagger.tags = ['Admin']
        #swagger.summary = 'Conta o número de cadastros'
        #swagger.description = 'Esse endpoint conta o número total de cadastros e exibe a lista de cadastros e o total.'
        #swagger.responses[200] = {
            description: 'Lista de registros e total'
        }
    */
    let total = adminModel.countRegisters();
    let registers = adminModel.getRegisterList();
    res.render('adminView', { registers, total });
})