const express = require('express')
const app = express()
const path = require('path');
const swaggerUi = require('swagger-ui-express');
const swaggerFile = require('./swagger-output.json');
const bodyParser = require('body-parser');
const homeRoute = require('./src/routes/homeRoute')
const adminRoute = require('./src/routes/adminRoute')

//bodyParser
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

//rotas
app.use(homeRoute)
app.use(adminRoute)

//arquivos
app.use(express.static(path.join(__dirname, 'public')))

//swagger
app.use('/docs', swaggerUi.serve, swaggerUi.setup(swaggerFile));

//ejs
app.set('view engine', 'ejs')
app.set('views', './src/views/')

app.listen(3000, function(){
    console.log('App rodando na porta 3000')
})