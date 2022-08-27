package com.dicoding.kotlin


fun main(){


/*
* Untuk mengetahui nilai maksimal yang dapat disimpan oleh suatu tipe Number, kita bisa menggunakan properti MAX_VALUE.
*   Sementara untuk mengetahui nilai minimal yang dapat disimpan, gunakan properti MIN_VALUE. */

    println("Untuk mencari nilai maksimal dan minimum yang dapat disimpan suatu tipe data number")
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    val overRangeInt = Int.MAX_VALUE + 1

    val nilaiInt : Int = 1456789012
    val maxLong = Long.MAX_VALUE

    println("nilai dari maxLong : $maxLong")

    println("Nilai dari Int : $nilaiInt")


    println(maxInt)
    println("over Range Int $overRangeInt")
    println(minInt)

    println("===========================================================================================================")
    println("===========================================================================================================")
    /*Terdapat beberapa operator matematika pada tipe data Number seperti penjumlahan (+), pengurangan (-),
    perkalian (*) , pembagian (/) dan modulus (%, atau sisa hasil bagi).*/

    println("Operator penjumlahan")
    val numberOne =1
    val numberTwo = 3

    println("hasil dari pejumlahan dari " + numberOne + " + " + numberTwo + " = "+ (numberOne + numberTwo))

    //Perlu diketahui, hasil operasi pembagian pada tipe data Int akan dibulatkan kebawah. Contohnya seperti berikut:

    val angka1 : Int = 27
    val angka2 : Int = 10

    println ("hasil pembagian dari 27 / 10 =  "+ (angka1/angka2))

    // sama seperti perhitungan matematika pembagian dan perkalian didahulukan , begitu pula di kotlin

    println("hasil dari 5 + 4 * 4 = "+(5+4*4))

    // apabila operasi 5+4 ingin di opersikan terlebih dahulu maka tambahkan tanda kurung
    println("hasil dari (5+4)*4 = "+((5+4)*4))


    //di Kotlin tidak bisa melakukna konversi secara langsung. Contoh ketika ingin mengkonversikan dari tipe dat
    // byte ke tipe data int .
    println("Konversi tipe data ")
    val byteNumber : Byte = 1
    //val intNumber : Int = byteNumber // program akan error

    //untuk mengatasinya, lakukan konversi menggunakan bantuan toInt()
    val intNumber : Int = byteNumber.toInt()

    println("hasil konversi dari byte ke int : $intNumber")

    /*ADAPUN BEBERAPA FUNGSI KONVERSI YANG DAPAT DIGUNAKAN ANTARA LAIN :
    * toByte(): Byte

        toShort(): Short

        toInt(): Int

        toLong(): Long

        toFloat(): Float

        toDouble(): Double

        toChar(): Char
        * */

    println("contoh penggunaan konversi")

    val stringNumber = "23"
    val intAngka = 3

    println(intAngka + stringNumber.toInt())

    //Dengan Kotlin kita juga bisa menuliskan nilai numerik yang “readable” dengan menggunakan tanda underscores seperti berikut:

    val readableNumber = 1_000_234

    println("hasil dari READABLE : $readableNumber")
}