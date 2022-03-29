class Repartidor(nombre : String,  edad : Int ,  salario : Double,  plus : Int, var zona : String) :Empleados( nombre, edad ,  salario , plus) {


    override fun PLUS() {
        var resultado = 0.0

        if (edad <= 25 && zona   == "zona 3"){
            resultado = salario + plus
            println("Su salario total es: "+resultado)

        }else if(edad > 25 && zona != "zona 3"){
            resultado = salario
            println("Su salario total es: "+resultado)
        }
        println("Su nombre: $nombre Su edad: $edad su zona: $zona Su salario: $salario")
    }
}