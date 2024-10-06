const LoginModel = require('../models/loginModel')
const login = new LoginModel();
const logged = login.isLogeed();

exports.getLogin = ((req, res) => {
    res.send(`<h1>${logged}</h1>`)
})

exports.getIsLogged = ((req, res) => {
    res.render('loginView', { logged: logged })
})