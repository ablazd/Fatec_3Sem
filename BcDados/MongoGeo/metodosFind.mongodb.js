use('geo')
db.municipios.find().count()//5570

//listar todos os municipios terminados em tu
use('geo')
db.municipios.find({nome: /tu$/i}, {nome:1, codigo_uf})