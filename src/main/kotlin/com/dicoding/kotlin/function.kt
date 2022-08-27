package com.dicoding.kotlin


fun setUse(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}
fun main() {
    val user = setUse("Alfian", 19)
    println(user)

    printUser("Alfian")
}

