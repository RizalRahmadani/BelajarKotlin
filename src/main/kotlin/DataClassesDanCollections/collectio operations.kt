package DataClassesDanCollections

fun main() {
    // untuk memfilter suatu data  dengan memilih bilangan yang habis dibagi dua dengan fungsi filter()
    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
    val evenList = numberList.filter{it % 2 == 0}
    println(evenList)

    //membfilter dengan kondisi yang tidak sesuai dengan kondisi yang diberikan
    val notEvenList = numberList.filterNot { it % 2 ==0 }
    println(notEvenList)

    //fungsi map untuk membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya.
    val multipliedBye5 = numberList.map{it*5} // kondisi mansing masing item di numberlist akan dikalikan 5
    println(multipliedBye5)//it di kondisi berfungsi untuk mempresentasikan masing-masing item pada numberList

    //fungsi count() untuk menghitung jumlah item pada collection
    println(numberList.count())

    //menggunakan fungsi lambda didalam fungsi count()
    println(numberList.count({it % 3 == 0}))//menampilkan jumlah item kelipatan dari tiga

    //untuk mencari sebuah item kita bisa menggunakan find(), firstOrNull(), & lastOrNull()
    val firstOddNumber = numberList.find{it % 2 == 1} //mengembalikan nilai secara langsung apabila kondisi terpenuhi tanpa melakukna iterasi
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    println(firstOddNumber)
    println(firstOrNullNumber)

    //fungsi first & last
    val moreThan10 =numberList.first{it < 10}
    val fungsiLast = numberList.last{it == 10}
        println(moreThan10)
        println(fungsiLast)

    //fungsi sum untuk menjumlahkan item yang ada dicollection
    val total =numberList.sum()
    println(total)

    //fungsi sorted() untuk mengurutkan item yang ada di dalam collection.
    val kotlinChar = listOf('k','o','t','l','i','n')
    val ascendingSort = kotlinChar.sorted() // secara default ascending / dari terkecil
    println(ascendingSort)

    //mengurutkan dari terbersar/descanding menggunakan sortedDescending()
    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)

}