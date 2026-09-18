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
If a function does not return any useful value -- > the return type is *Unit*. 
</br> 
Unit -- > a type with only one value. </br> 
It is not required to declare that Unit is returned explicitly in the function body. 
- must not use return keyword or declare a return type. 
```Kotlin
fun printMessage(message: String){
    println(message)
    // return unit or return are optional 
}

fun main(){
    printMessage("Hello")
}
```
#### SINGLE-EXPRESSION FUNCTIONS
For more concise code -- > can use single-expression functions. 
- i.e. *sum* can be shortened. 

```Kotlin
fun sum(x: Int, y: Int) = x + y
```
The function body is declared by the assignment operator '='. In this case, Kotlin uses type inference
which means the return type can be omitted. 
</br> 
*When using {} for declaring the function body, the return type must be declared unless its Unit.*

#### EARLY RETURNS IN FUNCTIONS 
To stop code in a function from processing past a certain point, use *return*. 
```Kotlin
val enrolledCats = mutableListOf("nisse", "bosse", "knasse", "chönk")
fun enrollCatNursery(name: String): String {
    if(name in enrolledCats){
        return "The cat has already beed enrolled into the nursery"
    }
    enrolledCats.add(name)
    return "Cat named $name enrolled, we'll come back to u shortly."
}

fun main(){
    println(enrollCatNursery("bosse"))
    println(enrollCatNursery("cherri"))
}
```

### LAMBDA EXPRESSIONS 
Concise code is very achievable thanks to lambda expressions, for example: 
```Kotlin
fun upperCaseString(text: String): String {
    return text.uppercase()
}

// written as a lambda expression in main instead
fun main(){
    val upperCaseString = {text: String -> text.uppercase()}
    println(upperCaseString("hello"))
}
```

Lambda expressions are written within curly brackets. Within is written: 
- The parameters followed by the '->'. 
- The function body after the '->'. 
The lambda expression is called by using the variable like a function and sending in parameters. 
</br>
*If you declare a lambda without parameters, you must not use '->'*.

Usage of lambda expressions: 
- Pass a lambda expression as parameter to another function. 
- Return a lambda expression from a function. 
- Invoke a lambda expression on its own. 

##### PASS TO ANOTHER FUNCTION 
###### FILTER
It is useful to pass a lambda expression to a function for example here: 
```Kotlin
// filter on collections
val numbers = listOf(1, 3, 5, -7, -9)
val positives = numbers.filter({ x -> x > 0 }) // true if element is positive 

val isNegative = {x: Int -> x < 0} // true if element is negative 
val negatives = numbers.filter(isNegative)

println(positives)
println(negatives)
```

The filter function accepts a lambda expression as a predicate & applies it to each element of the list. 
The element is only kept if the predicate returns *true*. </br> 
1. For positives -- > the lambda expression is added directly in the filter function. 
2. For negatives, the lambda expression is assigned to a variable. That variable is then used as a function parameter 
in the filter function. In this case, the type of function parameters have to be specified. 
3. *If a lambda expression is the only function param -- > function parentheses can be dropped*. 
   - *This is an example of a **trailing lambda***
###### MAP 
```Kotlin 
val numbers = listOf(1, 2, 4, 7, -9)
val doubled = numbers.map({x -> x*2}) // returns element * 2 for each 

val isTrippled = {x: Int -> x*3} // returns each element * 3 
val trippled = numbers.map(isTrippled)

println(doubled)
println(trippled)
```
The map function accepts a lambda expression as a transform function. 

<hr> 

##### FUNCTION TYPES 
Syntax for function: 
- Each parameter's type written within parentheses and separated by commas. 
- The return type after the '->'. 
  - I.e. (String) -> String.  
  - or (Int, Int) -> Int.
A lambda expression with a function type defined for upperCaseString():
```Kotlin
val upperCaseString: (String) -> String = {text -> text.uppercase()}
```
If the lambda expression has no parameters -- > the parentheses are left empty. </br> 
- for example: () -> Unit. </br>
*Parameter and return types must be declared either in the lambda expression or as function types. Otherwise, 
the compiler won't know what type the lambda expression is.*

##### RETURN FROM A FUNCTION 
When lambda expressions are returned from functions, the function type must be declared. 
##### INVOKE SEPARATELY 
##### TRAILING LAMBDAS 

<hr> 

## CLASSES 

## NULL SAFETY 
