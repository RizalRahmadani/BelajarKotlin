package KonsepFunctionalPrograming

fun main() {

    /*
    * let
    * Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek.
    * Penggunaan fungsi let akan banyak kita temukan pada objek yang bertipe non-null.
    * Contohnya seperti di bawah ini:
    * */

    val message : String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }//memanfaatkan fungsi run dan elvis untuk menjalakan kode lain
        ?: run{
            val text="message is null"
            println("text")
        }

    //dengan menggunakan fungsi let seperti kode di atas kita bisa mengurangi penggunaan opertator safe call seperti berikut
    val message1: String? =null
     val length = message1?.length ?: 0*2
    val text = "text length1 $length"
    println(text)


    /*
    *also
    *Fungsi also sama seperti fungsi apply, di mana nilai yang dikembalikan adalah nilai dari konteks objek.
    * Namun untuk konteks objeknya tersedia sebagai argumen (it).
    * Fungsi also baiknya digunakan ketika kita ingin menggunakan konteks dari objek sebagai argumen tanpa harus mengubah nilainya.
    *
    * */
    val text1 ="Hello Word"
    val result = text1.also { println("value length -> ${it.length}") }
    println("text1 -> $result")
}