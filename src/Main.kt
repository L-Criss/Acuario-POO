fun construirAcuario(){
    val acuario1 = `Acuario.txt`()
    acuario1.imprimirTamanio()
// altura y largo por defecto
    val acuario2 = `Acuario.txt`(ancho = 25)
    acuario2.imprimirTamanio()
// ancho por defect
    val acuario3 = `Acuario.txt`(alto = 35, largo = 110)
    acuario3.imprimirTamanio()

// todo personalizado
    val acuario4 = `Acuario.txt`(ancho = 25, alto = 35, largo = 110)
    acuario4.imprimirTamanio()

    val acuario7 = `Acuario.txt`(numeroDePeces = 29)
    acuario7.imprimirTamanio()
    acuario7.volumen = 70
    acuario7.imprimirTamanio()


}

fun main(){
    construirAcuario()
}