const loginModel = require('../models/loginModel')
const login = new loginModel()
const logged = login.isLogged()

exports.getLogin = ((req, resp) => {    
    /* 
        #swagger.tags = ['Login']
        #swagger.summary = 'Call some function'
        #swagger.description = 'This endpoint will show if user is logged'
    */
    resp.send(`<h1>${logged}</h1>`)
})
exports.getIsLogged = ((req, res) => {    
    /*
        #swagger.ignore = true
    */
    res.render("loginView", { logged: logged })
})

exports.createUser = ((req, res) => {
    //#swagger.tags = ['Create User']
    const {email, password} = req.body;
    res.status(200).json("User add sucessfully");
})

exports.getById = ((req, res) => {
    const filter = req.query.filter;
    const version = req.headers.version;
    return res.status(200).send("Getting User");
})