const mongoose = require('mongoose'); // import do framework
const Schema = mongoose.Schema; //modelo de daods que iremos trabalhar
let userSchema = new Schema({
    name: {type: String, required: true, max:100},
    age: {type: Number, required: true},
});

//exportar o modelo
module.exports = mongoose.model('User', userSchema)