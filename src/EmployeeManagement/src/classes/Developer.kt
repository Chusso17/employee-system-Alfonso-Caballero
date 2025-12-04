package classes

class Developer(override val name: String,salary: Double) : Employee() {
    override var salary: Double = 0.0
        set(value) {
            field = if (value>0) value else 0.00
        }
    init {
        this.salary =salary
    }


    override fun work() {
        println("Writing and reviewing code")
    }

    override fun calculateAnnualBonus() = salary+(salary*0.1)

    override fun evaluatePerformance() {
        println("Code works well, but it should be optimised")
    }
}