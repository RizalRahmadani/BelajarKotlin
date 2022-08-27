package KonsepFunctionalPrograming

fun main() {

    //memanggil variabel nullable
    val value : Int? = null
    println(value.slice)


    println(value.slice1)

    //menggunakan safe
    val value1 : Int? = null
    val value2 : Int? = null
    println(value1?.slice2)
    println(value2?.slice2)


}

//nullable receifer menggunakan if expresion untuk mengecek  apakah receiver objeknya bernilai null
val Int?.slice : Int
    get() = if (this == null) 0 else this.div(2)

//menggunakan elvis operator
val Int?.slice1:Int
    get() = this?.div(2)?:0

//operator safe call
val Int.slice2: Int
    get() = this.div(2)