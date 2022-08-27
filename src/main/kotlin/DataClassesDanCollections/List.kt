package DataClassesDanCollections

class User1(){

}

fun main() {
    // list immutable yang tidak bisa dimanipulasi atau diubah datanya
    val numberList : List<Int> = listOf(1,2,3,4,5)
    // atau
    val numberLlist = listOf(1,2,3,4,5)
    var charList = listOf('a','b','c')
    //list dengan data yang beda beda dan memasukan sebuah class didalam list
    val anyList = listOf('a',"kotlin",3,true,User1())

    //megakses posisi tertentu dari list menggunakan indexing
    println(anyList[3])

    //list mutable yaitu list yang bisa memanipulasi atau melakukan perubahan pada nilainya
    // menambah, menghapus, atau mengganti nilai yang sudah ada
    // menggunak keyword mutableListOf

    val anyList1 = mutableListOf('a',"kotlin",3,true, User1())
    anyList1.add('d')// menambah item di akhir list
    anyList1.add(1, "lover")//menambah item pada indeks ke-1
    anyList1[3] = false // mengubah nilai item pada indeks ke-3
    anyList1.removeAt(1)//menghapus item User1() berdasarkan idex atau posiss nilai di dalam Array
}