const express = require('express');
const router = express.Router();


const temperaturaController = require('../controllers/temperaturaController');

router.get('/input', temperaturaController.input)
router.get('/listar', temperaturaController.listar)

module.exports = router;