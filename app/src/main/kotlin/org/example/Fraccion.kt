package org.example

class Fraccion(
    private var _numerador: Int,
    private var _denominador: Int
) : Comparable<Fraccion> {
    
    var numerador: Int = 0
        get() = field
        set(value) { field = value }
    
    var denominador: Int = 1
        get() = field
        set(value) {
            if (value == 0) throw IllegalArgumentException("El denominador no puede ser cero")
            field = value
        }
    
    init {
        this.numerador = _numerador
        this.denominador = _denominador
    }
    
    companion object {
        fun desdeDecimal(decimal: Double): Fraccion {
            val precision = 1000000
            val numerador = (decimal * precision).toInt()
            val denominador = precision
            return Fraccion(numerador, denominador)._simplificar()
        }
    }
    
    override fun toString(): String {
        return "$_numerador/$_denominador"
    }
    
    fun mostrar() {
        println(toString())
    }
    
    // Operadores aritméticos
    operator fun plus(otra: Fraccion): Fraccion {
        val numeradorSuma = this.numerador * otra.denominador + otra.numerador * this.denominador
        val denominadorSuma = this.denominador * otra.denominador
        return Fraccion(numeradorSuma, denominadorSuma)
    }
    
    operator fun minus(otra: Fraccion): Fraccion {
        val numeradorResta = this.numerador * otra.denominador - otra.numerador * this.denominador
        val denominadorResta = this.denominador * otra.denominador
        return Fraccion(numeradorResta, denominadorResta)
    }
    
    operator fun times(otra: Fraccion): Fraccion {
        val numeradorMultiplicacion = this.numerador * otra.numerador
        val denominadorMultiplicacion = this.denominador * otra.denominador
        return Fraccion(numeradorMultiplicacion, denominadorMultiplicacion)
    }
    
    operator fun div(otra: Fraccion): Fraccion {
        if (otra.numerador == 0) throw IllegalArgumentException("No se puede dividir por cero")
        val numeradorDivision = this.numerador * otra.denominador
        val denominadorDivision = this.denominador * otra.numerador
        return Fraccion(numeradorDivision, denominadorDivision)
    }
    
    
    override operator fun compareTo(otra: Fraccion): Int {
        val valorThis = this.numerador * otra.denominador
        val valorOtra = otra.numerador * this.denominador
        return valorThis.compareTo(valorOtra)
    }
    
    override operator fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fraccion) return false
        
        val thisSimplificada = this._simplificar()
        val otherSimplificada = other._simplificar()
        
        return thisSimplificada.numerador == otherSimplificada.numerador &&
               thisSimplificada.denominador == otherSimplificada.denominador
    }
    
    override fun hashCode(): Int {
        val simplificada = this._simplificar()
        return 31 * simplificada.numerador + simplificada.denominador
    }
    
    
    fun esMayor(otra: Fraccion): Boolean {
        return this.compareTo(otra) > 0
    }
    
    fun esMenor(otra: Fraccion): Boolean {
        return this.compareTo(otra) < 0
    }
    
    fun aDecimal(): Double {
        return numerador.toDouble() / denominador.toDouble()
    }
    
    fun _simplificar(): Fraccion {
        val mcd = mcd(kotlin.math.abs(this.numerador), kotlin.math.abs(this.denominador))
        return Fraccion(this.numerador / mcd, this.denominador / mcd)
    }
    
    private fun mcd(a: Int, b: Int): Int {
        return if (b == 0) a else mcd(b, a % b)
    }
}