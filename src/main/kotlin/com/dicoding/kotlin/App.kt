package com.dicoding.kotlin


fun setUser(name: String, age:Int) = "Your name is $name and you $age years old"

fun printName(name:String){
    println("Your name is $name")
}

fun main(){
    val officeOpen = 7
    val officeClosed= 16
    val now = 20

    val isOpen = now >= officeOpen && now <= officeClosed

    println("Office is open: $isOpen")







}