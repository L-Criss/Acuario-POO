package acuario
import kotlin.math.PI

open class Acuario(

    open var largo: Int = 100,
    open var ancho: Int = 20,
    open var alto: Int = 40

) {

    open var forma = "Rectangulo"

    open var volumen: Int
        get() = ancho * alto * largo / 1000
        set(valor) {
            alto = (valor * 1000) / (ancho * largo)
        }

    open var agua: Double = 0.0
    get() = volumen * 0.9

    constructor(numeroPeces: Int) : this() {

        val tanque = numeroPeces * 2000 * 1.1

        alto = (tanque / (largo * ancho)).toInt()
    }

    open fun imprimirTamanio() {

        println("Forma: $forma")
        println("Ancho: $ancho cm")
        println("Largo: $largo cm")
        println("Alto: $alto cm")
        println("Volumen: $volumen litros")
        println("Agua: $agua litros (${agua / volumen * 100}% lleno)")
    }
}

class TanqueTorre(

    override var alto: Int,
    var diametro: Int

) : Acuario(

    alto = alto,
    largo = diametro,
    ancho = diametro

) {

    override var forma = "Cilindro"

    override var volumen: Int
        get() = ((PI * (ancho / 2) * (largo / 2) * alto) / 1000).toInt()

        set(valor) {
            alto = ((valor * 1000) / (PI * (ancho / 2) * (largo / 2))).toInt()
        }

    override var agua = volumen * 0.8
}