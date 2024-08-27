const alunos = require('../models/alunosModel');

exports.getAlunos = ((req, res) => {
    let listaAlunos = '';
    for(let i = 0; i < alunos.length; i++) {
        listaAlunos += `<li>${alunos[i].nome} - ${alunos[i].idade} anos</li>`;
    }
    res.render('listarAlunosView', { listaAlunos });
})

exports.adicionarAluno = ((req, res) => {
    res.render('adicionarAlunoView');
})

exports.saveAluno = ((req, res) => {
    let nome = req.body.nome;
    let idade = req.body.idade;
    if (nome && idade){
        alunos.push({ nome: nome, idade: parseInt(idade) });
        res.redirect('/alunos/getAll');
    } else {
        res.send('Dados Incorretos');
    }
})

exports.alunosWorks = (req, res) => {
    res.send('Alunos Works!');
};