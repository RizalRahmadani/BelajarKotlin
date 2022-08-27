package com.dicoding.kotlin

fun main() {
    // Indexing string
    /*
    * Apa itu Indexing?
    * Indexing merupakan sebuah cara yang memudahkan kita untuk mengakses elemen yang berada
    * di dalam sebuah Collection dengan memanfaatkan index atau posisi dari elemen tersebut.
    * Posisi dari sebuah elemen pada umumnya dimulai dari angka 0.
    * */
//    val text  = "Kotlin"
//    val firstChar = text[0]
//
//    print("First character of $text is $firstChar")

                             // Iterasi objek string menggunakan for loop
                                    //    val text  = "Kotlin"
                                    //    for (char in text){
                                    //        print("$char ")
                                    //    }

    //Escaped String
        /*
        * scaped String yang memungkinkan kita untuk mengurangi ambiguitas nilai yang berada di dalam sebuah String.
        * Untuk mengatasinya, kita bisa melakukan escaped dengan menambahkan karakter
        * backslash (\) sebelum tanda petik ganda
        *
        * lain \” di atas, terdapat beberapa karakter lain yang dapat digunakan untuk melakukan escaped di dalam sebuah String, antara lain:

    \t: menambah tab ke dalam teks.

    \n: membuat baris baru di dalam teks.

    \’: menambah karakter single quote kedalam teks.

    \”: menambah karakter double quote kedalam teks.

    \\: menambah karakter backslash kedalam teks.
        * */

    //    val statement = "Kotlin is \"Awesome!\""
    //    println(statement)

    /*
    * Selain itu, kita juga bisa menambahkan sebuah Unicode ke dalam sebuah String seperti berikut:
    * */
    //    val name = "Unicode test: \u00A9"
    //    print(name)


                                    //Raw String
    /*Raw String yang memungkinkan kita menuliskan multiline dan arbitrary text. Ketika ingin
     membuat beberapa baris String biasanya kita melakukan escaped terhadap String dengan
     memanfaatkan karakter escape \n seperti berikut:
     */
//    val line = "Line 1\n" +
//            "Line 2\n" +
//            "Line 3\n" +
//            "Line 4\n"

    /*dengan row string kita bisa menggunakannya seperti berikut ini :*/
    val line = """
        line 1
        line 2
        line 3
        line 4
        line 5
    """.trimIndent()

    println (line)
}