package KonsepFunctionalPrograming


//fungsi fold() untuk melakukan perhitungan setiap nilai yang berada didalam sebuah collection tanpa harus melakukan iterasi item tersebut satu persatu

val numbers = listOf(1,2,3)
val fold = numbers.foldRight(10){a, item ->
    println("current $item")
    println("item $a")
    println()
    a+item

}

//Drop
/*
Selanjutnya adalah fungsi drop(), fungsi yang bisa kita manfaatkan untuk memangkas item yang berada di dalam sebuah objek collection berdasarkan jumlah yang kita tentukan.
 */
val number = listOf(1,2,3,4,5,6)
val drop = number.drop(3)//memangkas dari indeks pertama
val dorpLast = number.dropLast(3)


//Take
/*
Jika fungsi drop() digunakan untuk memangkas, fungsi take() bisa kita manfaatkan untuk menyaring item yang berada di dalam sebuah objek collection. P
 */

val total = listOf(1,2,3,4,5,6,7)
val take = total.take(3)//menampilkan 3 item dari indeks pertama
val takeLast = total.takeLast(3)//menampilkan 3 item dari indeks terakhir

fun main() {

    println("Fold result: $fold")

    println(drop)
    println(dorpLast)
    println(take)
    println(takeLast)
}
