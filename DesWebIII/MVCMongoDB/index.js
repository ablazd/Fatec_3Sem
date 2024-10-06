//import frameworks
const express = require('express')
const app = express()
const swaggerUi = require('swagger-ui-express')
const swaggerFile = require('./swagger-output.json')
const bodyParser = require('body-parser')

//import rotas
const userRoute = require('./src/routes/userRoute')
const projectRoute = require('./src/routes/projectRoute')

//acesso ao mongoose (BD)
const mongoose = require('mongoose')
let url = 'mongodb://localhost:27017/Fatec2'
let mongoDB = process.env.MONGODB_URI || url
mongoose.connect(mongoDB)
mongoose.Promise = global.Promise
let db = mongoose.connection
db.on('error', console.error.bind(console, 'Erro ao conectar ao MongoDB'))

//middlewares
app.use(bodyParser.json())
app.use(bodyParser.urlencoded({extended: false}))
app.use('/docs', swaggerUi.serve, swaggerUi.setup(swaggerFile))

//rotas
app.use(userRoute)
app.use(projectRoute)

app.listen(3000, () => {
    console.log('Servidor em execução na porta 3000')
})