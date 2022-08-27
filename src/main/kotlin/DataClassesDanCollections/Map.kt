package DataClassesDanCollections

fun main() {
    // map menyimpan data dengan fortmat key-value

    val capital = mapOf("jakarta" to "Indonesia", "London" to "England", "New Delhi" to "India")
    // untuk mengakses nilai dari map kita bisa menggukan key yang sudah dimasukan.
    println(capital["jakarta"])//jika menggunakan indexing apabila data tidak ditemukan akan menampilkan null
    println(capital["jepang"])
    // atau bisa menggunakan fungsi getValue()
    println(capital.getValue("jakarta"))//jika menggunakan getValue apabila data tidak ditemukan maka akan tampil Exception
//    println(capital.getValue("jepang"))

    //kita dapat menampilkan key apa saja yang ada dalam map dengan menggunakan fungsi keys()
    val mapKeys = capital.keys
    println(mapKeys)
    //sedangkan untuk mengetahui nilai apa saja yang ada di dalam map kita bisa menggunakan fungsi values()

    val mapValues = capital.values
    println(mapValues)

    //mengubah map capital menjadi mutable untuk bisa menambahkan key-value
    val mutableCapital = capital.toMutableMap()
    //selanjutnya kita bisa menambahkan dengan menggunakan fungsi put()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
    println(mutableCapital)
}