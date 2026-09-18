#!/usr/bin/env kotlin

// CONDITIONAL EXPRESSIONS PRACTICE
import kotlin.random.Random

fun conExercise1(){
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)

    print(if(firstResult == secondResult) "You win :)" else "You lose :(")
}

fun conExercise2(){
    val button = "A"
    println(
        when(button){
            "A"->"Yes"
            "B"->"No"
            "X"-> "Menu"
            "Y"-> "Nothing"
            else -> "There is no such button"
        }
    )
}

// LOOPS
fun loopExercise1(){
    var pizzaSlices = 0

    while(pizzaSlices < 7){
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    pizzaSlices++ // so that it doesnt stop on 7 but also doesnt include 8 above.
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

}

// second alternative
fun loopExercise1SecondAlternative(){
    var pizzaSlices = 0
    pizzaSlices++ // ig so we dont start on 0 pizzaSlices
    do {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    } while (pizzaSlices < 8)
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

fun LoopExercise2(){
    for(number in 1..100){
        println(
            when{
                number % 15 == 0 -> "fizzbuzz"
                number % 3 == 0 -> "fizz"
                number % 5 == 0 -> "buzz"
                else -> "$number"
            }
        )
    }
}

fun loopExercise3(){
    val words = listOf("dino", "limo", "magazine", "leopard")
    println(
        for(word in words){
            if(word.startWith("l")){
                println(word)
            } else return
        }
    )
}