package Parte1_Hora

fun main() {
    // Crear objetos Hora
    val hora1 = Hora(12, 30, 0)
    val hora2 = Hora(14, 15)
    val hora3 = Hora(7)
    val hora4 = Hora(hora1)
    println("-----HORAS_CREADAS------------------")
    // Mostrar las horas creadas
    println("Hora 1: $hora1")
    println("Hora 2: $hora2")
    println("Hora 3: $hora3")
    println("Hora 4: $hora4")
    println("-------------------------------------")
    // Cambiar la hora y mostrar de nuevo
    println("-----CAMBIA LA HORA_1-----------")
    hora1.setLaHora(20, 45, 15)
    println("Hora 1 cambiada: $hora1")
    println("-------------------------------------")
    // Comparar las horas
    println("-----------COMPARAR_HORAS-----------")
    val resultado = hora2.compararCon(hora3)
    if (resultado < 0) {
        println("$hora2 es anterior a $hora3")
    } else if (resultado > 0) {
        println("$hora2 es posterior a $hora3")
    } else {
        println("$hora2 y $hora3 son iguales")
    }

}







