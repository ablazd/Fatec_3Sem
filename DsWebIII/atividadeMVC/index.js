const express = require('express')
const app = express()
const swaggerUi = require('swagger-ui-express');
const swaggerFile = require('./swagger-output.json');
const bodyParser = require('body-parser');
const cadastroRoute = require('./src/routes/cadastroRoute');

app.use(bodyParser.urlencoded({ extended: false }));
app.use('/docs', swaggerUi.serve, swaggerUi.setup(swaggerFile));
app.use(cadastroRoute)

app.set('view engine', 'ejs')
app.set('views', './src/views/')

app.listen(3000, function(){
    console.log('App rodando na porta 3000')
})