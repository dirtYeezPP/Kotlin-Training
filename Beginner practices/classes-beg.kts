#!/usr/bin/env kotlin


data class Employee(val name: String, var salary: Int)

fun main1(){
    val emp = Employee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)
}

// correct!


// declare additional data classes needed to compile
