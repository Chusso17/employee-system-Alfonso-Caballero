package classes

class Designer(override val name: String, salary : Double): Employee() {
    override var salary: Double = 0.0
        set(value) {
            field = if (value>0) value else 0.00
        }
    init {
        this.salary =salary
    }

    override fun work() {
        println("Creating and optimizing visual design")
    }

    override fun calculateAnnualBonus(): Double = salary+(salary*0.15)

    override fun evaluatePerformance() {
        println("Great design!")
    }

}