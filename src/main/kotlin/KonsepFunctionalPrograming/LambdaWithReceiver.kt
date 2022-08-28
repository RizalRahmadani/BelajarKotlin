package KonsepFunctionalPrograming

fun main() {

    //memanggil function lambda with receiver
    val message = buildString1 {
        append("Hello")
        append("from")
        append("lambda")
    }
    println(message)

}


//kode yang tidak menggunakan DSL(Domain Specific Languages)
fun buildString(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello")
    stringBuilder.append("from")
    stringBuilder.append("lambda")
    return stringBuilder.toString()
}

//contoh membuat lambda with receiver menggunakan DSL

fun buildString1(action: StringBuilder.() -> Unit): String{
    val StringBuilder = StringBuilder()
    StringBuilder.action()
    return StringBuilder.toString()
}