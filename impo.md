# THINGS FROM THA BEGINNER THINGY 

## BASIC TYPES 
**Category -- > Basic types** </br>
Integer -- > Byte, short, Int, Long </br> 
Unsigned Int -- > Ubyte, Ushort, UInt, ULong </br>
Float-point num -- > Float, Double </br>
Bool -- > Boolean </br> 
Characters -- > Char </br> 
Strings -- > String </br> 

For example: 
```kotlin
fun main() {
    val a: Int = 1000 
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}
```
<hr> 

## COLLECTIONS 
List -- > ordered collection of items. </br> 
Set -- > Unique unordered collection of items. </br> 
Map -- > Sets of key-value pairs, keys are unique and map only to one value. </br> 

##### LIST 
Lists are ordered and allow duplicate items.
```Kotlin
val readOnlyList = listOf("Yanny", "PP", "meow")
val shapes: MutableList<String> = mutableListOf("Triangle", "Square")

// read only view of a mutable list is created by the following --> casting 
val lockedShapes: List<String> = shapes
println("circle" in readOnlyList) // false 
```
##### SET 
Sets are unordered and only store unique items.

```Kotlin 
val readOnlyFruit = setOf("apple", "banan", "cherry") 
val fruit: MutableSet<String> = mutableSetOf("apple", "bana", "cher")
// cast 
val LockedFruits: Set<String> = fruit 
```
##### MAP 
Maps store key-value pairs whereas values can be accessed by referencing the key. 
- Every key shall be unique 
- You can have duplicate values 

Kotlin can infer the types that are stored, but you can also declare the type explicitly. 
```Kotlin
// Read only 
val readOnlyDrinkMenu = mapOf("apple" to 100, "kiwi" to 190)

val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "cherry" to 200)
// casting 
val lockedMenu: Map<String, Int> = juiceMenu 
println("The value of apple juiceus is ${readOnlyFruit["apple"]}")

println(readOnlyFruit.containsKey("apple"))
```
Keys and values are examples of **properties** of an object. Such are accessed by 
appending the property name after the object and a . 

<hr>

## CONTROL FLOW 

### CONDITIONAL EXPRESSIONS 
If ure picking between *if* or *when* Kotlin recommends using *when*.
- -- > easier to read.
- -- > easier to add another branch.
- -- > fewer mistakes in code.
##### IF 
Example: 
```Kotlin
val d: Int 
val check = true 

if(check){
    d = 21
} else {
    d = 2 
}
```
Kotlin has no ternary operator, instead *if* can be used as an expression:
```Kotlin 
val a = 1 
val b = 2 
println(if ( a > b ) a else b) // returns the value 2 
```
##### WHEN 
When is used when u have a conditional expression with multiple branches. 
- Place value you want to evaluate in ()
- Place branches in {}
- Use -> in each branch to separate checks from actions to take when check = success. 
When can be used either as a statement or an expression. 
- Statement -- > does not return anything, performs action instead. 
- Expression -- > returns a value which could later be used in code. 
**When as statement:**

```Kotlin
val obj = "Hello"
when(obj){
    "1"->println("one")
    "Hello"->println("Greeting")
    else -> println("Gay")
}
```
All branches are checked sequentially until one is satisfied. 
Survival of the fittest or whatever. 
**When as expression:**
```Kotlin
// without a subject 

fun main() {
    val trafficLight = "Red"
    
    val trafficAction = when {
        trafficLight == "Green" -> "Go"
        trafficLight == "Yellow" -> "Slow down"
        trafficLight == "Red" -> "STOP"
        else -> "Malfunction"
    }
    println(trafficAction)
}
```
It is also possible to have the state as the object: 
```Kotlin
val trafficLight = "Red"

val trafficAction = when (trafficLight){
    "Green"->"Go"
    //...
}
```
A present subject makes the code more comprehensive and helps Kotlin check that all possible cases are covered. 
### RANGES 
Ranges are most commonly created with the use of ".." whereas "1..4" equals "1, 2, 3, 4".
- Exclude the end value -- > "1..<4" equals "1, 2, 3".
- Reverse order -- > "4 downTo 1" equals "4, 3, 2,1".
- Declare incrementation step other than 1 -- > "1..5 step 2" equals "1, 3, 5".
- This is also possible with chars -- > 'a'..'d' equals 'a', 'b', 'c', 'd'.

### LOOPS
Two most common loop structures are *for* and *while*.
##### FOR 
Use for when you want to iterate over ranges of values and perform an action. 
```Kotlin
for(number in 1..5){
    print(number)
}

// iterate over a collection 
val cakes = listOf("carrot", "red velvet", "chocolate")
for (cake in cakes){
    println("yum its a $cake")
}
```
##### WHILE 
Use while to continue an action until a specific condition is met. 
It can be used in two ways: 
- Execute code block while a conditional expression is true. 
- Execute a code block and then check the conditional expression. 

**WHILE**
```Kotlin
var cakesEaten = 0 
while (cakesEaten < 3){
    println("eat a cake")
    cakesEaten++ //increment operator -- > += 1 basically 
}
```
**DO-WHILE**
```Kotlin
var cakesEaten = 0
var cakesBaked = 0 

// while 
while(cakesEaten < 3 ){
    println("eat a cake")
    cakesEaten++ 
}

// do-while 
do{
    println("Bake a cake")
    cakesBaked++
} while (cakesBaked < cakesEaten) 
```
<hr> 

## FUNCTIONS 
If a function doesn't return anything useful, the return type and keyword can be omitted.
```Kotlin
fun sum(x: Int, y:Int): Int{
    return x + y 
}

fun main(){
    println(sum(1, 3))
}
```
- x & y are function parameters (inside the parentheses) both of type *Int*.
- The functions return type is *Int*. 

##### NAMED ARGUMENTS 
When calling a function there is no must for including parameter names. That, however, does make the code more comprehensive. 
This is called using *named arguments*. When they are included, parameters can be written in any order. 
```Kotlin
// string templates access the parameter values, convert them to strings & concat into string for print. 
fun printMessageWithPrefix(message: String, prefix: String){
    println("[$prefix] $message")
}

fun main(){
    // uses named args with swapped order 
    printMessageWithPrefix(prefix = "Log", message = "hello")
}
```
##### DEFAULT PARAM VALUES
Function parameters can be assigned default values. A parameter with a default value can be omitted upon calling the function.
</br>
*After the first skipped parameter, all subsequent parameters must be named.* 
#### FUNCTIONS WITHOUT RETURN 
#### SINGLE-EXPRESSION FUNCTIONS
#### EARLY RETURNS IN FUNCTIONS 

### LAMBDA EXPRESSIONS 
###### PASS TO ANOTHER FUNCTION 
##### FUNCTION TYPES 
##### RETURN FROM A FUNCTION 
###### INVOKE SEPARATELY 
##### TRAILING LAMBDAS 
