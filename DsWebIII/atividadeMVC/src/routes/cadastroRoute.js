const express = require('express')
const router = express.Router()

router.get("/cadastro", (req, res) => {
    res.send('<h1>Cadastro')
})

module.exports = router