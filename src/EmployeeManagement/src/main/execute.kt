package main

import classes.Designer
import classes.Developer
import classes.Employee
import classes.Manager

fun main(){
    val employeeList = mutableListOf<Employee>(
        Designer("Pepe", 1800.00),
        Developer("David", 1700.00),
        Manager("Julia", 3000.00)
    )

    employeeList.forEach {
        it.work()
        println(it.details())
        println("salario con bonus: ${it.calculateAnnualBonus()}")
        it.evaluatePerformance()
    }
}