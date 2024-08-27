use('geo')
db.estados.find(forEach(function(estado){
    db.estados.updateOne(
        {_id: estado._id}, {
            $set: {type: 'Point', coordinates:[estado.longitude, estado.latitude]}
        }, 
        $unset: {latitude: '', longitude: ''}
    )
}))