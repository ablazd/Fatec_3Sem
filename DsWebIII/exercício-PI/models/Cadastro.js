const mongoose = require('mongoose');

const CadastroSchema = new mongoose.Schema({
    nome: {
        type: String,
        required: true
    },
    email: {
        type: String,
        required: true
    }
});

module.exports = mongoose.model('Cadastro', CadastroSchema);

