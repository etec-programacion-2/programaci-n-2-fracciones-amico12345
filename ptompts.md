### Prompt 1
- Fecha: 2025-06-24
- Herramienta: Claude
- Prompt: "Implementar el constructor principal que reciba numerador y denominador como parámetros.Explicame"
- Respuesta: "El constructor principal en Kotlin se define directamente en la declaración de la clase. Te explico cómo funciona:
Desglose de los componentes:
1. class Fraccion: Nombre de la clase
2. (val numerador: Int, val denominador: Int): Esta es la declaración del constructor principal

Los parámetros van entre paréntesis después del nombre de la clase
val indica que son propiedades de solo lectura (inmutables)
numerador: Int y denominador: Int son los parámetros que recibe el constructor

¿Qué hace el constructor principal?

Recibe parámetros: Cuando creas una instancia, debes pasar estos valores
Crea propiedades: Al usar val o var, automáticamente se convierten en propiedades de la clase
Inicializa el objeto: Asigna los valores recibidos a las propiedades
Explicación del método toString():
1. override: Esta palabra clave indica que estás sobrescribiendo un método que ya existe en la clase padre (Any)
2. fun toString(): String:

Declara una función llamada toString
Debe devolver un String
No recibe parámetros

3. return "$numerador/$denominador":

Usa string templates ($) para insertar los valores de las propiedades
Devuelve el formato "numerador/denominador"

¿Por qué sobrescribir toString()?

Representación legible: Sin toString() personalizado, al imprimir el objeto verías algo como Fraccion@1a2b3c4d
Con toString(): Verás 3/4 que es mucho más útil
Se llama automáticamente: Cuando uses println() o concatenes con strings"
### Prompt 2
- Fecha: 2025-06-27
- Herramienta: Gemini
- Prompt: "necesito tu ayuda con un codigo de kotlin seghun la programacion orientada a objetos te enviare 2 codigos y una consigna: primero la consigna, luego el primer codigo llamado Fraccion.kt y el segundo Calculadora.kt necesito que corrigas los errores "
- Respuesta: "package org.example
class Fraccion(var numerador: Int, var denominador: Int) {
    init {
        if (denominador == 0) {
            throw IllegalArgumentException("El denominador no puede ser cero")
        }
    }
    override fun toString(): String {
        return "$numerador/$denominador"
    }
    fun mostrar() {
        println(this.toString())
    }
}
package org.example
fun main() {
    val fraccion = Fraccion(3, 4)
    println(fraccion.toString())
    fraccion.mostrar()
    fraccion.numerador = 5
    fraccion.denominador = 8
    println("Nueva fracción: ${fraccion.toString()}")
    try {
        val fraccionInvalida = Fraccion(1, 0)
        println(fraccionInvalida.toString())
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
    try {
        fraccion.denominador = 0
    } catch (e: IllegalArgumentException) {
        println("Error al cambiar denominador: ${e.message}")
    }
}

### Prompt 3
- Fecha: 2025-06-27
- Herramienta: Gemini
- Prompt: "Envie el error que me dio el codigo
Reusing configuration cache.


> Task :app:run FAILED

Error: no se ha encontrado o cargado la clase principal org.example.AppKt

Causado por: java.lang.ClassNotFoundException: org.example.AppKt


[Incubating] Problems report is available at: file:///home/etec/programaci-n-2-fracciones-amico12345/build/reports/problems/problems-report.html


FAILURE: Build failed with an exception.


* What went wrong:

Execution failed for task ':app:run'.

> Process 'command '/home/etec/.gradle/jdks/eclipse_adoptium-21-amd64-linux.2/bin/java'' finished with non-zero exit value 1


* Try:

> Run with --stacktrace option to get the stack trace.

> Run with --info or --debug option to get more log output.

> Run with --scan to get full insights.

> Get more help at https://help.gradle.org.


Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.


You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.


For more on this, please refer to https://docs.gradle.org/8.13/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.


BUILD FAILED in 837ms

2 actionable tasks: 1 executed, 1 up-to-date

Configuration cache entry reused.

explicame elerror "
- Respuesta: "package org.example
