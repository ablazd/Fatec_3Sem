module.exports = class TemperaturaModel {
    
    converte(tipo, temperatura) {
        let farenheit;
        let celsius;
        let tipinho = tipo.toLowerCase()
        switch (tipinho) {
          case ('c'):
            farenheit = (9 * temperatura / 5) + 32
            return (`${farenheit}`)
          case ('f'):
            celsius = (5 * (temperatura - 32) / 9)
            return (`${celsius}`)
        }
      }
}