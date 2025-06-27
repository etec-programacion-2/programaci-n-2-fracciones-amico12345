package org.example

fun main() {
    val fraccion = Fraccion(3, 4)
    val fraccion1 = Fraccion(1, 2)
    println("Mostrar fracciones")
    println("La fraccion 1 es: ")
    fraccion.mostrar()
    println("La fraccion 2 es: ")
    fraccion1.mostrar()

    val sumaFraccion = fraccion + fraccion1
    println("\nSuma y resta con las fracciones creadas")
    println("La suma de las fracciones es: $sumaFraccion")
    val restaFraccion = fraccion - fraccion1
    println("La resta de las fracciones es: $restaFraccion")

    val simplificada = sumaFraccion._simplificar()
    println("\nSimplificacion de suma y resta")
    println("La suma de las fracciones simplificada es: $simplificada")
    val simplificada1 = restaFraccion._simplificar()
    println("La resta de las fracciones simplificada es: $simplificada1")
}