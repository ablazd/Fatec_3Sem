module.exports = class HomeModel {
    static registerList = []
    
    constructor(name, email){
        this.name = name
        this.email = email
    }


    static register(name, email) {
        const newUser = new HomeModel(name, email)
        this.registerList.push(newUser)
    }

    static countRegisters() {
        return this.registerList.length
    }

    
}
