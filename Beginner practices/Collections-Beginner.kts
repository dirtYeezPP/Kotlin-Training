#!/usr/bin/env kotlin

// COLLECTIONS -- EXERCISES
fun exercise1(){
    val greenNumbers = listOf(2, 4, 656)
    val redNumbers = listOf(4,6,7,8)
    val total = greenNumbers.count() + redNumbers.count()
    println(total)
}

fun exercise2(){
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")
}

fun exercise3(){
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelled as '${number2word[n]}'")
}