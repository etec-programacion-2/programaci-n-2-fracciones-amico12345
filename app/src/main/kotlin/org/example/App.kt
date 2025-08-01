package org.example
fun main() {
val fraccion = Fraccion(2, 10)
val fraccion1 = Fraccion(2, 5)

println("Mostrar fracciones:")
println("La fraccion 1 es: ")
fraccion.mostrar()

println("La fraccion 2 es: ")
fraccion1.mostrar()

val sumaFraccion = fraccion + fraccion1
println("\nSuma y resta:")

println("La suma de las fracciones es: $sumaFraccion")
val restaFraccion = fraccion - fraccion1
println("La resta de las fracciones es: $restaFraccion")
val simplificada = sumaFraccion._simplificar()

println("\nSimplificacion de suma y resta:")

println("La suma de las fracciones simplificada es: $simplificada")
val simplificada1 = restaFraccion._simplificar()
println("La resta de las fracciones simplificada es: $simplificada1")
val multiplicacionFraccion = fraccion * fraccion1

println("\nMultiplicacion y division:")

println("La multiplicacion de las fracciones es: $multiplicacionFraccion")
val divisionFraccion = fraccion / fraccion1
println("La division de las fracciones es: $divisionFraccion")
val simplificada2 = multiplicacionFraccion._simplificar()

println("\nSimplificacion de multiplicacion y division:")

println("La multiplicacion de las fracciones simplificada es: $simplificada2")
val simplificada3 = divisionFraccion._simplificar()
println("La division de las fracciones simplificada es: $simplificada3")

println("\nPrueba de division por cero:")
try {
val fraccionCero = Fraccion(0, 1)
val divisionPorCero = fraccion / fraccionCero
println("Resultado: $divisionPorCero")
} catch (e: Exception) {
println("${e.message}")
}

println("\nComparacion de fracciones:")
println("$fraccion es > $fraccion1? ${fraccion.esMayor(fraccion1)}")
println("$fraccion es < $fraccion1? ${fraccion.esMenor(fraccion1)}")
println("$fraccion es = $fraccion1? ${fraccion.equals(fraccion1)}")

println("\nConversion a decimal:")
println("$fraccion a decimal: ${fraccion.aDecimal()}")
println("$fraccion1 a decimal: ${fraccion1.aDecimal()}")

println("\nConversion a fracción:")
val fraccionDesdeDecimal = Fraccion.desdeDecimal(0.75)
println("Fracción creada desde decimal 0.75: $fraccionDesdeDecimal")
}