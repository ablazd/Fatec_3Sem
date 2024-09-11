const express = require('express');
const bodyParser = require('body-parser');
const mongoose = require('mongoose');

const userRoute = require('./src/routes/userRoute');
const app = express();
//conexão com o banco de dados
let url = 'mongodb://localhost:27017/Fatec'
let mongodb = process.env.MONGODB_URI || url;
mongoose.connect(mongodb);
mongoose.Promise = global.Promise;
let db = mongoose.connection;
db.on('error', console.error.bind(console, 'erro ao conectar com a base de dados'));

app.use(userRoute)
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: false}));

app.listen(3000, () => {
    console.log('Servidor em execução na porta 3000')
});