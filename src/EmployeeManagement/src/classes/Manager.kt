package classes

class Manager(override val name: String, salary : Double) : Employee() {
    override var salary: Double = 0.0
        set(value) {
            field = if (value>0) value else 0.00
        }
    init {
        this.salary =salary
    }

    override fun work() {
        println("Supervising the team and planning projects")
    }

    override fun calculateAnnualBonus(): Double = salary+(salary*0.2)

    override fun evaluatePerformance() {
        println("Great job so far everyone")
    }
}