package org.example

class Fraccion(
    private var _numerador: Int, 
    private var _denominador: Int) {
    
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
    
    override fun toString(): String {
        return "$_numerador/$_denominador"
    }
    
    fun mostrar() {
        println(toString())
    }

    operator fun plus(otra: Fraccion): Fraccion{
        val numeradorSuma = this.numerador * otra.denominador + otra.numerador * this.denominador
        val denominadorSuma = this.denominador * otra.denominador
        return Fraccion(numeradorSuma, denominadorSuma)
    }

    operator fun minus(otra: Fraccion): Fraccion{
        val numeradorResta = this.numerador * otra.denominador - otra.numerador * this.denominador
        val denominadorResta = this.denominador * otra.denominador
        return Fraccion(numeradorResta, denominadorResta)
    }
    fun _simplificar(): Fraccion {
        val mcd = mcd(this.numerador, this.denominador)
        return Fraccion(this.numerador / mcd, this.denominador / mcd)
    }
    private fun mcd(a: Int, b: Int): Int {
        return if (b == 0) a else mcd(b, a % b)
    }
}