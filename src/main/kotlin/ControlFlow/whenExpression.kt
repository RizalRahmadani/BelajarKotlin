package ControlFlow

import java.util.*

fun main() {
    val value = 20

    when(value){
        6 -> println("value is 6")
        7-> println("value is 7")
        8-> println("value is 8")

        else -> println("value cannot be reached")

    }

    //when expression dapat mengembalikan nilai dan dapat di simpan didalma sebuah variabel

    val nilai1 = 7
    val StringOfValue1 = when (nilai1){
        6 -> "valu is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "valus cannot be reached"
    }
    println(StringOfValue1)

    //jika kita memiliki lebih dari satu baris code maka kita bisa memasukannya ke curly braces atau dalam kurung kurawal

    val nilai = 7
    val StringOfValue = when (nilai){
        6 -> {
            println("ini angka 6")
            "valu is 6"
        }
        7 -> {
            println("ini angka 7")
            "value is 7"
        }
        8 -> {
            println("ini angka 8")
            "value is 8"
        }
        else -> {
            println("tidak ditemukan")
            "valus cannot be reached"
        }
    }
    println(StringOfValue)




    // when menentukan istanche atau jenis tipe datanya mnggunakna is atau !is
    val anyType : Any = 100L
    when(anyType){
        !is Long -> println("the valus has a long type")
        !is String -> println("the value has String type")
        else -> println("undefined")
    }

    //when expression digunakan untuk memeriksa nilai yang terdapat padad sebuah range atau collection
    val values = 27
    val ranges = 10..50

    when(values){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }
}
