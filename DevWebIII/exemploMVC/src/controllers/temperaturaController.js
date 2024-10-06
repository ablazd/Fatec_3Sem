const TemperaturaModel = require('../models/temperaturaModel')
const temperatura = new TemperaturaModel()

exports.input = ((req, res) => {
    temperaturaSelecionada = req.body.temperatura;
    tipo = req.body.tipo;
})

exports.listar = ((req, res) => {
    const valorConvertido = temperatura.converte(tipo, temperaturaSelecionada);
    res.render('listaTemperatura', {temperatura: valorConvertido})
})
