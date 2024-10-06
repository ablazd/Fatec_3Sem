const homeModel = require('../models/homeModel')

exports.getHome = ((req, res) => {
    /* 
        #swagger.tags = ['Home']
        #swagger.summary = 'Renderiza a tela inicial'
        #swagger.description = 'Esse endpoint renderiza a tela inicial e exibe uma mensagem de cadastro vazia.'
        #swagger.responses[200] = {
            description: 'Tela inicial carregada com sucesso'
        }
    */
    let cadastro = ''    
    res.render('homeView', { cadastro })
})

exports.saveRegister = ((req, res) => {
        /* 
        #swagger.tags = ['Home']
        #swagger.summary = 'Salva um novo registro'
        #swagger.description = 'Esse endpoint salva um novo cadastro com base nos campos fornecidos no corpo da requisição. Retorna uma mensagem de sucesso ou erro.'
        #swagger.responses[200] = {
            description: 'Cadastro salvo com sucesso ou erro de validação.'
        }
    */
    let name = req.body.name
    let email = req.body.email

    if(name && email) {
        homeModel.register(name, email)
        cadastro = '<div class="bg-success p-2 text-white"><p>Cadastro efetuado com Sucesso</p></div>'
        res.render('homeView', { cadastro })
    } else {
        cadastro = '<div class="bg-danger p-2 text-white"><p>Todos os campos devem ser preenchidos</p></div>'
        res.render('homeView', { cadastro })
    }
})