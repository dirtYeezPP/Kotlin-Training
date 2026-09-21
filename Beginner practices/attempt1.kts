#!/usr/bin/env kotlin

class Circle(var diameter: Float) {
    val radius = diameter / 2
    val area = (radius * radius) * 3.14
}

fun main(){
    val r1 = Circle(3.5f)
    println("area of it is ${r1.area}")
}