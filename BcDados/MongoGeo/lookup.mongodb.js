use('geo')
db.municipios.aggregate([
    {
        $lookup: {
          from: 'estados',
          localField: 'codigo_uf',
          foreignField: 'codigo_uf',
          as: 'estado'
        }
    }
])

//agregação total do documento
use('geo')
db.municipios.aggregate([
    {
        $lookup: {
          from: 'estados',
          localField: 'codigo_uf',
          foreignField: 'codigo_uf',
          as: 'estado'
        }
    },
    {
        $match:{
            nome: {$eq: "Votorantim"}
        }
    },
    {
        $project:{
            "_id": 0,
            "nome": 1,
            "local_coordinates": 1,
            "estado.nome": 1
        }
    }
])

use('geo')
db.estados.aggregate([
    {$lookup:{
        from: 'municipios',
        localField: 'codigo_uf',
        foreignField: 'codigo_uf',
        as: 'relacaoMunicipio'
    }},
    {
        $match: {
            nome: {$eq: "Acre"}
        }
    },
    {$project: {
        _id: 0,
        nome: 1,
        "relacaoMunicipio.nome": 1
    }}
])