const express = require('express');
const app = express();

const loginRoute = require('./src/routes/loginRoute');
const temperaturaRoute = require('./src/routes/temperaturaRoute');
app.use(loginRoute);
app.use(temperaturaRoute);

app.set('view engine', 'ejs');
app.set('views', './src/views');

app.listen(3000, function() {
    console.log('App rodando na porta 3000');
})

