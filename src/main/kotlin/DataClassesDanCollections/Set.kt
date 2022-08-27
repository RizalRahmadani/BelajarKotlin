package DataClassesDanCollections

fun main() {
    // untuk menyimpan data tanpa ada yang sama atau duplikasi
    val integerSet = setOf(1,2,4,2,1,5)
    val setB = setOf(1,2,4,5)
    println(integerSet == setB)// membadingkan isi dari kesamaan isi set

    println(5 in setB)//mengecek apakan sebuah nilai ada di dalam set


    //fungsi union dan intersect untuk mengetahui gabungan dan irisan 2 buah set
    val setC = setOf(1,5,7)
    val union = integerSet.union(setC)
    val intersect = integerSet.intersect(setC)

    println("isi dari union : "+union)
    println("isi dari intersect : " + intersect)

    // mutable set kita bisa menambah dan menghapus item namun tidak bisa mengubah nilai seperti di list

    val mutableSet = mutableSetOf(1,2,4,2,1,5)
//    mutableSet[2] = 6 //tidak bisa mengubah set immutable
    println("sebelum perubahan $mutableSet")
    mutableSet.add(6)//menambah item di akhir set
    mutableSet.remove(1)//menghapus item yang memimiliki nilai 1

    println("setelah perubahan $mutableSet")
}