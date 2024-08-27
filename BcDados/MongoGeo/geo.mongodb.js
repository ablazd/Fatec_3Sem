//criando os indices 2dsphere
use('geo')
db.estados.createIndex({local: '2dsphere'})

use('geo')
db.municipios.createIndex({local: '2dsphere'})

use('geo')
db.municipios.find({
    local: {
        $near: {
            $geometry: {
                type: "Point",
                coordinates: [-47.4495, -23.5313] //fatec
            },
            $maxDistance: 50000 // em metros (50 km)
        }
    }
}, {nome:1, _id:0})
//encontrar pontos em um raio (circulo)

use('geo')
db.municipios.find({
    local: {
        $geoWithin: {
            $centerSphere: [[-47.4495, -23.5313], 20 / 6378.1] // radio em radianos
        }
    }
}, {nome:1, _id:0}).sort({nome:1})//ordem alfabética
//6378.1 é o radio medio da Terra em km, necessario para conerter em radianos

//encontrar pontos dentro de um poligono
use('geo')
db.municipios.find({
    local: {
        $geoWithin: {
            $polygon: [
                [
                    -49.237050578281185,
                    -22.771582644909827
                  ],
                  [
                    -48.94912373098404,
                    -23.4006682751032
                  ],
                  [
                    -47.1931162192669,
                    -23.63819746514679
                  ],
                  [
                    -47.351056565729266,
                    -22.52578528878587
                  ],
                  [
                    -49.237050578281185,
                    -22.771582644909827
                ]
            ]
            
        }
    }
}, {nome: 1, _id:0}).count()//conta

//localizando todos os pontos dentro de uma caixa (box)
use('geo')
db.municipios.find({
    local: {
        $geoWithin: {
            $box: [
                [-51.58, -21.99], //canto inferior esquerdo
                [-51.20, -22.24] //canto superior direito
            ]
        }
    }
}, {nome:1, _id:0})