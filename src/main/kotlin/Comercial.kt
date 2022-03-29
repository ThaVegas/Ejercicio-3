class Comercial(nombre : String,  edad : Int ,  salario : Double,  plus : Int, var comision : Double) :Empleados( nombre, edad ,  salario , plus ) {



    override fun PLUS() {
        var resultado = 0.0

        if (edad >=30 && comision >= 200){
           resultado = salario + plus
            println("Su salario total es: "+resultado)

        }else if(edad < 30 && comision < 200){
            resultado = salario
            println("Su salario total es: "+resultado)
        }
            println("Su nombre: $nombre Su edad: $edad su Comision: $comision Su salario: $salario")
    }


}