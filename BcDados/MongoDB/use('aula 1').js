use('aula 1')

db.filmes.insertOne({"titulo:": "Guerra nas estrelas", 
                    "diretor": "George Lucas", 
                    "ano": 1978, 
                    "nota": "⭐⭐⭐⭐⭐"})

db.filmes.find() // select * from filmes

use('aula01')
db.filmes.insertMany([
    {"titulo:": "Guerra nas estrelas 2", 
    "diretor": "George Lucas", 
    "ano": 1995, 
    "nota": "⭐⭐⭐⭐⭐"},
    {"titulo:": "Guerra nas estrelas 3", 
    "diretor": "George Lucas", 
        "ano": 1985, 
        "nota": "⭐⭐⭐⭐⭐"}
])