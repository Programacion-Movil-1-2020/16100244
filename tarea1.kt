import kotlin.system.exitProcess

class PC(var Pro: String, var tar: String, var Disk: String){
    var procesador=Pro
    var tarjetaGra=tar
    var discoDuro=Disk
}
     //Lista de computadoras
 var  equiposArmados:MutableList<PC> = mutableListOf()

   //Arreglos para los tipos de componentes
 var arrayProcesador:Array<String> = arrayOf("Intel i3","Intel i5","Intel i7")
 var arrayTarjeta:Array<String> = arrayOf("MDA","CGA","HGC")
 var arrayDisk:Array<String> = arrayOf("Solido","Mecanico")


fun main(args: Array<String>) {
   // var  equiposArmados:MutableList<PC> = mutableListOf( PC("Intel","algo","dos") )
     //var  equiposArmados:MutableList<PC> = mutableListOf()


    //para captura de datos

   println("Seleccione una opcion: \nArmar una computadora [1]\nMostrar computadoras armadas [2] \nSalir [3]")
    var opcion=0
    when (opcion){
        1-> menu()
        2-> showList()
        3->  print("pulse una tecla para salir")
    }

    //println( equiposArmados )

   // var equiposArmados:MutableList<PC> = mutableListOf()
}

//Muestra menu

fun menu(){
   var vpro:String =""
   var vTar:String =""
   var vDisk:String =""

    println("Seleccione un procesador:\n[1]  ${arrayProcesador[0]} \n[2] ${arrayProcesador[1]} \n[3] ${arrayProcesador[2]}")
    var x=0
    var y=0
    var z=0
    when(x) {
            1-> vpro = arrayProcesador[0]
            2-> vpro = arrayProcesador[1]
            3-> vpro = arrayProcesador[2]
    }

    println("Seleccione un tipo de tarjeta:\n[1]  ${arrayTarjeta[0]} \n[2] ${arrayTarjeta[1]} \n[3] ${arrayTarjeta[2]}")
    when(y) {
        1-> vTar = arrayTarjeta[0]
        2-> vTar = arrayTarjeta[1]
        3-> vTar = arrayTarjeta[2]
    }

    println("Seleccione un tipo de Disco:\n[1]  ${arrayDisk[0]} \n[2] ${arrayDisk[1]} \n[3] ${arrayDisk[2]}")
    when(z) {
        1-> vDisk = arrayDisk[0]
        2-> vDisk = arrayDisk[1]
        3-> vDisk = arrayDisk[2]
    }


     //Agregar a la lista
    equiposArmados.add(vpro,vTar,vDisk)

    //equiposArmados.add()
}


  //Muestra lista
fun showList(){
equiposArmados.forEach {
    println("Procesador: " + it.Pro + "Tarjeta Grafica: \n" + it.tar + "Disco Duro: \n" + it.Disk)
    }
}