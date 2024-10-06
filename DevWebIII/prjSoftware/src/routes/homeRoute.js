const express = require('express')
const router = express.Router()

const homeController = require('../controllers/homeController')

router.get("/", homeController.getHome)
router.post("/save", homeController.saveRegister)

module.exports = router