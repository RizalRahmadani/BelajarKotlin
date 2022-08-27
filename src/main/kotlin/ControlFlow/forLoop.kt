package ControlFlow

import com.dicoding.kotlin.printName

fun main() {

    //perulangan menggunakan ranges
    val ranges = 1..5
    for(i in ranges) {
        println("value is $i")
    }
    val range = 1.rangeTo(5)
    for (i in range){
        println("isi loop $i")
    }
    println()
    //range for loop menggunakan step
    val rangess = 1.rangeTo(10)step 3
    for (i in rangess){
        println("isi dari step : $i")
    }

    //mengakses indeks elemen ranges dengan menggunakna withIndex()

    val jarak = 1.rangeTo(10) step 3
    for((index, value) in ranges.withIndex()){
        println("value $value with index $index")
    }

    //memanfaatkan salah satu ekstensi kotlin forEach
    val jaraks = 1.rangeTo(10) step 3
    jaraks.forEach{value ->
        println("value is $value")
    }

    //untuk mendapatkan index dari tiap nilai gunakan ekstensi forEachIndexed

    val contoh = 1.rangeTo(10) step 3
    contoh.forEachIndexed{index, value ->
        println("value $value with index $index ")

    }

    //jika kita ingin menggunkana argumen index saja kita bisa mengubah argumen value menjadi _
    val contoh1 = 1.rangeTo(10) step 3
    contoh1.forEachIndexed{index, _ ->
        println("index $index ")

    }


}