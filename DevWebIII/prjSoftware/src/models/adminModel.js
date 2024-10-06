const homeModel = require('../models/homeModel')
let registerList = homeModel.registerList

module.exports = class adminModel {
    static deleteRegister(email) {
        registerList = registerList.filter(register => register.email !== email)
        //ele recria a lista de cadastros com todos elementos que nao correspondem ao passado
        homeModel.registerList = registerList
    }

    static getRegisterList() {
        return homeModel.registerList
    }
    
    static countRegisters() {
        return homeModel.registerList.length
    }
}