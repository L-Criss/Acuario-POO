package acuario

class Acuario (largo: Int = 100, ancho: Int = 20, alto: Int = 40){
    var ancho:Int = ancho;
    var alto:Int = alto;
    var largo:Int = largo;
    var tanque = 0.0

    var volumen: Int
        get() = ancho * alto * largo / 1000 // 1000 cm^3 = 1 l
    //
    set(valor) {
            alto = (valor * 1000) / (ancho * largo)
        }


    constructor(numeroDePeces: Int) : this() {

        // 2000 cm3 por pez + 10% extra
        tanque = numeroDePeces * 2000 * 1.1

        // calcular altura
        alto = (tanque / (largo * ancho)).toInt()
    }

    fun imprimirTamanio(){
        println("Ancho: $ancho cm "+
        "Largo: $largo cm " +
        "Alto: $alto cm")

        // 1 l = 1000 cm^3
        println("Volumen: $volumen l")
    }

    init {
        println("Inicializando Acuario")
    }
}