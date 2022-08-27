package ControlFlow

fun main() {
    val rangeInt = 1..10 step 2
    rangeInt.forEach{
        print("$it")
    }
println()
    println(rangeInt.step)


    var rangeTerbalik = 10 downTo 1
    if (11 !in rangeTerbalik){
        println("no value 11 in range")
    }

    var rangeChar = 'A'.rangeTo('F')
    rangeChar.forEach{
        println("$it")
    }
}