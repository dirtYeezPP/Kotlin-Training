#!/usr/bin/env kotlin
import kotlin.random.Random

data class Employee1(val name: String, var salary: Int)

fun main1(){
    val emp = Employee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)
}

// correct!


// declare additional data classes needed to compile
data class Person(val name: Name, val address: Address, val ownsPet: Boolean = true)
data class Name(val first: String, val last: String)
data class City(val name: String, val country: String)
data class Address(val street: String, var city: City)


fun main(){
    val person = Person(
        Name("John", "Pork"),
        Address("In", City("Your", "Walls")),
        ownsPet = false
    )
}

// correct yay

""""
 To test your code, you need a generator that can create random employees.
 Define a RandomEmployeeGenerator class with a fixed list of potential names (inside the class body). 
 Configure the class with a minimum and maximum salary (inside the class header). 
 In the class body, define the generateEmployee() function. Once again, 
 the main function demonstrates how you can use this class.
""""

//import kotlin.random.Random above
data class Employee(val name: String, var salary: Int)

data class RandomEmpGenerator(var minSalary: Int, var maxSalary: Int ){
    val names = listOf("John", "Mary", "Yan", "PP", "Sarah", "Noori", "Milker")
    fun generateEmployee() =
        Employee(names.random(),
            Random.nextInt(from = minSalary, until = maxSalary))
}

fun main(){
    val empGen = RandomEmpGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())

}

// took the solution example...  im cooked in ts i cant focus ughhhh


// null safety

"""
    You have the employeeById function that gives you access to a database of employees of a company. 
    Unfortunately, this function returns a value of the Employee? type, so the result can be null.
    Your goal is to write a function that returns the salary of an employee when their id is provided, 
    or 0 if the employee is missing from the database.
"""

data class Employee2 (val name: String, var salary: Int)

fun employeeById(id: Int) = when(id) {
    1 -> Employee("Mary", 20)
    2 -> null
    3 -> Employee("John", 21)
    4 -> Employee("Ann", 23)
    else -> null
}

fun salaryById(id: Int) = employeeById(id)?.salary ?: 0

fun main() {
    println((1..5).sumOf { id -> salaryById(id) })
}

