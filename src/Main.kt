import acuario.Acuario
import acuario.TanqueTorre


fun construirAcuario(){
    val miTorre = TanqueTorre(
        diametro = 25,
        alto = 45
    )

    miTorre.imprimirTamanio()


}

fun main(){
    construirAcuario()
}