const express = require('express')
const router = express.Router()
const adminController = require('../controllers/adminController')

router.get("/admin", adminController.getAdmin)
router.post('/admin/delete', adminController.deleteRegister)
router.get("/admin/emailCount", adminController.countRegisters)

module.exports = router