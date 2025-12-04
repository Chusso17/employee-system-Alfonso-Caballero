package classes

abstract class Employee () : Evaluable {
    abstract val name : String
    abstract var salary : Double

    abstract fun work()
    abstract fun calculateAnnualBonus() : Double
    fun details() : String = "Nombre: $name; salario: $salary"
}