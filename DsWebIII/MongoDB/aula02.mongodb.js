/*Tipos de dados simples
string
number
boolean
date
objectId
*Tipos de dados complexos
Array
Object
Geo
Binary*/

use('aula02')
db.receitas.insertOne({
    _id: "123",
    nome: "Hambúrguer de Costela",
    preco: 15.99,
    ingredientes: ["pão", "costela", "queijo"],
    vegetariano: false,
    dataCadastro: new Date(),
    detalhe: {
        "calorias": 1500,
        "porcao": 1,
        "veggie": false
    }
})

use('aula02')
db.receitas.find() //select * from receitas

use('aula02')
db.receitas.find({},{}) // 1° - filtros, 2° - projeção das colunas

//select nome, preco from receitas;
use('aula02')
db.receitas.find({}, {nome:1, preco:1, _id:0})

use('aula02')
db.receitas.insertOne({
    nome: "Hambúrguer de Cogumelo",
    preco: 35.99,
    ingredientes: ["pão", "cogumelo", "queijo"],
    vegetariano: true,
    dataCadastro: new Date(),
    detalhe: {
        "calorias": 700,
        "porcao": 1,
        "veggie": true
    }
})

//select nome, preco from receitas where vegetariano = true
use('aula2')
db.receitas.find({vegetariano: true},{nome:1, preco:1})

use('aula02')
db.receitas.find({vegetariano: {$eq: true}}, {nome:1, preco:1})

//select nome, preco from receitas where nome = 'costela';
use('aula02')
db.receitas.find({nome:'costela'}, {nome:1, preco:1})

//select nome, preco from receitas where nome <> 'costela';
use('aula02')
db.receitas.find({nome: {$ne: 'costela'}}, {nome:1, preco:1})

//select nome, preco from receitas where nome LIKE '%costela%';
use('aula02') // i = insensitive case
db.receitas.find({nome: /costela/i}, {nome:1, preco:1})

//select nome, preco, calorias from receitas where preco > 20.00
use('aula02')
db.receitas.find({preco: {$gt: 20.00}}, {nome:1, preco:1, "detalhe.calorias":1})

//select nome, preco, calorias from receitas where preco between 15 and 30
use('aula02')
db.receitas.find({preco:{
                        $gte: 15.00, 
                        $lte: 30.00}}, 
                        {nome:1, preco:1, "detalhe.calorias":1})

//update receitas set preco = 25.00 where nome like '%costela%'
use('aula02')
db.receitas.updateOne(
                    {nome: /costela/i},
                    {$set: {preco: 25.00}})
use('aula02')
db.receitas.find()

//update receitas set vegetariano = true where preco .
use('aula02')
db.receitas.updateMany(
                    {preco: {$gte: 10}},
                    {$set: {vegetariano: true}})
use('aula02')
db.receitas.find()

//unset no update - remove o atributo especificado
db.receitas.updateMany(
    {}, // no exemplo não há filtro
    {$unset: {vegetariano: ''}}
)

//$push - adiciona um novo elemento ao array no update
use('aula02')
db.receitas.updateOne(
    {nome: /cogu/i},
    {$push: {ingredientes: 'Alface'}})
use('aula02')
db.receitas.find({nome: /cogu/i}, {nome:1, ingredientes:1})

//$pull - remove um elemento ja existente no array
use('aula02')
db.receitas.updateMany(
    {},
    {$pull: {ingredientes: 'queijo'}}
)
use('aula02')
db.receitas.find({nome: /cogu/i}, {nome:1, ingredientes:1})

//incrementando ou decrementando um valor no update
use('aula02')
db.receitas.updateMany({},
                        {$inc: {"detalhe.calorias": -100}}
)
use('aula02')
db.receitas.find({nome: /cogu/i}, {nome:1, calorias:1})
