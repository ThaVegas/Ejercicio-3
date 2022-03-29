fun main(args: Array<String>) {
        /*
        Aaron Benavides Vega, Ced 207870975.
        */
    println("Ingrese su nombre")
    var nombre = readLine()?.toString() as String
    println("Ingrese su edad")
    var edad = readLine()?.toInt() as Int
    println("Ingrese su Comission")
    var comision = readLine()?.toDouble() as Double
    println("Ingrese su salario")
    var salario = readLine()?.toDouble() as Double

    val C1 = Comercial( nombre, edad, salario,  300,comision)

    C1.PLUS()
    //---------------
    println("Ingrese su nombre")
    var nombre1 = readLine()?.toString() as String
    println("Ingrese su edad")
    var edad1 = readLine()?.toInt() as Int
    println("Ingrese su zona")
    var zona1 = readLine()?.toString() as String
    println("Ingrese su salario")
    var salario1 = readLine()?.toDouble() as Double

    val R1 = Repartidor(nombre1, edad1, salario1 ,  300, zona1)
        R1.PLUS()
}

