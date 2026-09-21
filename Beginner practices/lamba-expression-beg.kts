#!/usr/bin/env kotlin

// LAMBDA EXPRESSION EXERCISES
fun exercise1(){
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map{action -> "$prefix/$id/$action"}
    println(urls)
}

fun exercise2(){
    fun repeatN(n: Int, action: () -> Unit) {
        for (i in 1..n){
            action()
        }
    }

    fun main() {
        repeatN(5) {
            println("hello")
        }

    }
}