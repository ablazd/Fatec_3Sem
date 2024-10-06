const express = require('express');
const app = express();

app.use(express.urlencoded({ extended: true })); //tava dando um erro estranho ao tentar
                                                 // salvar o form dai pesquisei e precisava disso
app.use(express.json());

const alunoRoutes = require('./src/routes/alunosRoutes');
app.use('/', alunoRoutes);

app.set('view engine', 'ejs');
app.set('views', './src/views');

app.listen(3000, function() {
    console.log('App rodando na porta 3000');
})