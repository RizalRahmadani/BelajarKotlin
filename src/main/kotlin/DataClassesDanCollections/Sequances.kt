package DataClassesDanCollections

fun main() {
    //tanpa menggunakan sequance
    val list = (1..1000000).toList()
    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    //menggunakan fungsi assequence
//    list.asSequence().filter{it %5 == 0}.map{it*2}.forEach { println(it) }


    //membuat objek sequence.
    val sequenceNumber = generateSequence (1){ it+1 }
    sequenceNumber.take(5).forEach { println(it) } // menambahkan fungsi take


}