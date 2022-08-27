package KonsepFunctionalPrograming

fun main() {
    //memanggil function dengan named argument yang mana kita bisa memasukan parameter functionnya tidak sesuai posisinya
    val fullName = getFullName(middle = "rahmadani", first = "rizal", last = "ok")
    println(fullName)

    println(defaultArgument())

    println(defaultArgument(depan = "depan"))

}
//function numed argument
fun getFullName(first:String, middle:String, last:String): String{
    return "$first $middle $last"
}

//functional default argument yang mana jika kita tidak mengisi parameternya maka nilai defaultnya yang muncul
fun defaultArgument(
    depan : String ="rizal",
    tengah: String ="tengah",
    akhir: String = "akhir"

) :String{
    return "$depan $tengah $akhir"
}