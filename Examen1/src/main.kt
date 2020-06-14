import models.Auto

//var  Autos:MutableList<Auto> = mutableListOf()

var Autos:MutableList<Auto> = mutableListOf()

//Arrays de caracteristicas
//var arrayCaracteristicas:Array<String> = arrayOf("Transmision manual","Transmision automatica","Aire acondicionado","Frenos ABS","Bolsas de aire","Pantalla Tactil","Controles electricos")
//Array de caracteristicas especiales
//var arrayCaracEspe:Array<String> = arrayOf("Faros de niebla","Faros LED","Asientos de piel","Rines de 17 pulgadas","Cargador inalambrico","Camara de reversa","Monitoreo de punto ciego")


fun main()
{
 menu()
}

fun menu()
{
    println("\nSeleccione una opcion: \n[1]Ensamblar un auto nuevo \n[2]Ver autos ensamblados\n[3]Salir\n\n")
    var opcion: Int? = readLine()?.toInt()

    when(opcion){
        1-> captura()
        2->  imprimir() //Autos.forEach { it.imprimir() }
        3-> println("presione una tecla para salir")
    }
}

fun imprimir() {

var autosTotales=0

    for (item in Autos) {
        print(item.toString())
        autosTotales++
        print("Total de autos ensamblados: $autosTotales\n\n")

    }

//print(Autos)
    menu()
}

fun captura()
{
    //Letreros para captura
    println("\n")
    println("Ingrese la marca del auto: ")
    val marca: String? = readLine()

    println("Ingrese el modelo del auto: ")
    val modelo: String? = readLine()

    println("Ingrese las caracteristicas del auto: ")

    //val caracteristicas=cadena
    val caracteristicas: String? = readLine()

    println("Ingrese las caracteristicas especiales del auto: ")
    val caractEspe: String? = readLine()

    var objeto = Auto(marca!!,modelo!!,caracteristicas!!,caractEspe!!)

    Autos.add(objeto)

    menu()

    //var objeto1 = Persona(nombre!!, edad, sexo!!, peso!!, altura!!)
    //personas = mutableListOf(Persona("Juan", 22), Persona("Ana", 19), Persona("Marcos", 12))
   // Autos = mutableListOf(Auto(marca, modelo, caracteristicas, caractEspe))

}