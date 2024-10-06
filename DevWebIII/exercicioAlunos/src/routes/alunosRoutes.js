const express = require('express');
const router = express.Router();

const alunoController = require('../controllers/alunosController');

router.get('/alunos', alunoController.alunosWorks);
router.get('/alunos/getAll', alunoController.getAlunos);
router.get('/alunos/adicionar', alunoController.adicionarAluno);
router.post('/alunos/save', alunoController.saveAluno);

module.exports = router;