package com.dicoding.kotlin

//import java.awt.Color

//fun main() {
//    val colorRed = Color.RED
//    val colorGreen = Color.GREEN
//    val colorBlue = Color.BLUE
//}
//enum class Color(val value :Int){
//    RED(0xFF0000),
//    GREEN(0x00FF00),
//    BLUE(0x0000FF)
//}




//    val color : Color =Color.RED
//    println(color)
//}

//enum class Color{
//    RED, GREEN, BLUE
//}

    //Mendeklarasikan anonymous class untuk setiap Enum
//    enum class Color(val value: Int) {
//        RED(0xFF0000) {
//            override fun printValue() {
//                println("value of RED is $value")
//            }
//        },
//        GREEN(0x00FF00) {
//            override fun printValue() {
//                println("value of GREEN is $value")
//            }
//        },
//        BLUE(0x0000FF) {
//            override fun printValue() {
//                println("value of BLUE is $value")
//            }
//        };
//
//        abstract fun printValue()
//    }


// Syenthetic method yang memungkinkan kita mendapatkan daftar objek Enum dan nama dari tiap Enum itu sendiri
fun main() {
//     val colors : Array<Color> = Color.values()
//    colors.forEach { color ->
//        print("$color ")
//    }
//    println("\nMendapatkan nama dari objek enum menggunakan valueOf() ")
//    val color: Color = Color.valueOf("RED")
//    println("Color is $color")
//    println("Color value is ${color.value.toString(16)}")

    //Cara mendapatkan daftar objek enum dan nama dari objek enum dengan cara yang lebih umum
//    val colors: Array<Color> = enumValues()
//    colors.forEach {color ->
//        println(color)
//    }
//
//    val color: Color = enumValueOf("RED")
//    println("Color is $color")


    //Mendapatkan posisi tiap objek menggunakan properti ordinal
//    val color: Color = Color.GREEN
//
//    print("Position GREEN is ${color.ordinal}")


    //Mengecek instance dari enum menggunakan when expression
    val color: Color = Color.GREEN

    when(color){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }

}
enum class Color (val value : Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

