package com.dicoding.kotlin

fun main(){

    // Conjunction atau AND (&&)
    /*Operator AND (&&) akan mengembalikan nilai true jika semua hasil
    evaluasi expression yang diberikan bernilai true*/

    //    val officeOpen = 7
    //    val officeClosed = 16
    //    val now = 20
    //
    //    val isOpen = if (now >= officeOpen && now <= officeClosed){
    //        true
    //    } else {
    //        false
    //    }
    //
    //    print("Office is open : $isOpen")

    // ATAU BISA JUGA DENGAN CARA BEGINI:
    //
    //    val officeOpen = 7
    //    val officeClosed = 16
    //    val now = 20
    //
    //    val isOpen = now >= officeOpen && now <= officeClosed
    //
    //    print("Office is open : $isOpen")


                        //Disjunction atau OR(||)
                        /*Berbeda dengan operator AND (&&), operator OR (||) akan mengembalikan
                        nilai true jika hasil evaluasi dari salah satu expressions yang diberikan bernilai true.*/
                        //
                        //    val officeOpen = 7
                        //    val officeClosed = 16
                        //    val now = 20
                        //
                        //    val isClose = now < officeOpen || now > officeClosed
                        //
                        //    print("Office is closed : $isClose")


    //Negation atau NOT(!)
    /* Berbeda dengan operator AND (&&) dan operator OR(||), operator NOT(!) digunakan untuk melakukan negasi
    * pada hasil evaluasi expresion yang diberikan. contoh, jika hasil expression setelah dievaluasi bernilai true
    * maka operator NOT akan mengembalikan nilai false */

    val officeOpen = 7
    val now = 10
    val isOpen = now > officeOpen

    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }

}