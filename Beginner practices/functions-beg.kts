#!/usr/bin/env kotlin

// FUNCTIONS PRACTICE

import kotlin.math.PI

fun circleArea(radius: Int): Double {
    return PI * radius * radius
}

// second exercise
fun circleArea2(radius:Int): Double = PI * radius * radius

fun main(){
    println(circleArea(2)) // radius
}

// third exercise
fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
    ((hours * 60) + minutes) * 60 + seconds

fun main() {
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds( minutes = 1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(hours = 1, seconds = 1))
}

