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
        this.numerador = numerador
        this.denominador = denominador
    }
    
    override fun toString(): String {
        return "$_numerador/$_denominador"
    }
    
    fun mostrar() {
        println(toString())
    }
}