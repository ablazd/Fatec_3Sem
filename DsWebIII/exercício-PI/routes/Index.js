const express = require('express');
const router = express.Router();
const Cadastro = require('../models/Cadastro');

// Rota para Página Inicial
router.get('/', async (req, res) => {
    const cadastros = await Cadastro.find();
    res.render('index', { cadastros: cadastros });
});

// Criar Cadastro (POST)
router.post('/cadastrar', async (req, res) => {
    const { nome, email } = req.body;
    const novoCadastro = new Cadastro({ nome, email });
    await novoCadastro.save();
    res.redirect('/');
});

// Excluir Cadastro (DELETE)
router.post('/excluir/:id', async (req, res) => {
    const id = req.params.id;
    await Cadastro.findByIdAndDelete(id);
    res.redirect('/');
});

// Contar e-mails cadastrados (GET)
router.get('/contar', async (req, res) => {
    const count = await Cadastro.countDocuments();
    res.json({ count });
});

module.exports = router;
