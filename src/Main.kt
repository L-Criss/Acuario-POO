import acuario.Acuario
import acuario.PezPayaso
import acuario.TanqueTorre
import acuario.Tiburon


fun construirAcuario(){
    val miTorre = TanqueTorre(
        diametro = 25,
        alto = 45
    )

    miTorre.imprimirTamanio()


}

fun crearPeces() {

    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("Color del tiburon: ${tiburon.color}")
    tiburon.comer()

    println()

    println("Color del pez payaso: ${pezPayaso.color}")
    pezPayaso.comer()
}

fun main(){
    //construirAcuario()
    crearPeces()
}