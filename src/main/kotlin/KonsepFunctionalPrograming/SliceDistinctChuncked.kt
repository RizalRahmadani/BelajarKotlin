package KonsepFunctionalPrograming

//slice
/*
untuk menyaring item dari posisi tertentu
 */
val index = listOf(2,3,5,8)
val total1 = listOf(1,2,3,4,5,6,7,8,9,10)
val slice =total1.slice(3..6)//menampilkan item dari posisi indeks ke tiga sampai 6
val slice1 = total1.slice(index)//menampilkan item dengan posisi yang lebih spesifik


//Distinct
val nilai = listOf(1,2,1,3,4,5,2,3,4,5)
val distinct = nilai.distinct()//untuk menyaring item yang sama dalam collection

//menggunakan distinct didalam collection parameter data class
data class Item(val key:String, val value:Any)
val items = listOf(
    Item("1", "Kotlin"),
    Item("2", "is"),
    Item("3", "Awesome"),
    Item("3", "as"),
    Item("3", "Programming"),
    Item("3", "Language")
)



fun main() {
    println(slice)
    println(slice1)
    println(distinct)
//data class distinct
    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    //menyaring item yang memiliki panjang yang sama
    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct = text.distinctBy { it.length }
    println(distinct)


    //chunked
    //digunakan untuk memecah nilai string menjadi beberapa bagian kecil dalam bentuk array
    val word ="QWERTY"
    val chunked = word.chunked(3)
    println(chunked)
    //merubah nilai yang dipecah menjadi huruf kecl
    val chunkedTransForm = word.chunked(3){
        it.toString().toLowerCase()
    }
    println(chunkedTransForm)
}