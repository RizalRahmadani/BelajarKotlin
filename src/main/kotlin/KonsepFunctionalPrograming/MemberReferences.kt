package KonsepFunctionalPrograming



//deklarasi sebuah lambda dengan function type
val penjumlahan: (Int, Int) -> Int = {valueA, valueB -> valueA + valueB}

/*
Dengan Kotlin, kita bisa memisahkan lambda expression menjadi fungsi tersendiri dan mereferensikannya langsung
sebagai instance dari function type dengan cara seperti di bawah ini:
 */

val sume : (Int,Int) -> Int =::count
fun count(valueA: Int, valueB:Int):Int{
    return valueA + valueB
}

//kode diatas ditulis dengan mekanisme reflection yang berarti seperangkat fitur bahasa dan library yang memungkinkan kita untuk mengamati struktur kode dari proyek yang sedang kita kerjakan secara langsung

//function references
/*
pada suatu kondisi, terkadang kita butuh mereferensikan sebauh fungsi . sebagai contoh, misal kita memiliki fungsi seperti berikut:
 */

fun isEvenNumber(number : Int) = number %2 ==0

fun Int.isEvenNumber1() = this%2==0

/*
Fungsi di atas digunakan untuk memeriksa apakah suatu angka merupakan sebuah bilangan genap. Dengan menggunakan operator :: kita bisa menggunakannya sebagai instances dari function type. Sebagai contoh, penggunaan fungsi filter() yang menjadi bagian dari kelas List berikut:
 */

//fun main() {
//    val number = 1.rangeTo(10)
////    val evenNumber = number.filter(::isEvenNumber)
//    //mereferensikan sebuah extension function dengan cara menyertakan objek yang menjadi receivernya sebelum operator ::
//    val evenNumber = number.filter (Int::isEvenNumber1)
//    println(evenNumber)
//}


// property references . merepresentasikan sebuah properti dengan operator ::
var pesan = "Kotlin"

fun main(){
    println(::pesan.name)
    println(::pesan.get())

    ::pesan.set("kotlin academy")

    println(::pesan.get())
}

