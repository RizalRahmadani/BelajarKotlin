package KonsepFunctionalPrograming

import kotlin.text.StringBuilder

fun main() {

    //scope function with lambda receiver
    //fungsi run
    val text = "Hello"
    val result = text.run{
        val from = this
        val to = this.replace("hello", "kotlin")
        "replace text $from to $to"
    }
    println("result : $result")

    //with konsep objeknya disematkan sebagai argumen dan dari bolok lambda diakses sebagai receiver. yang mana nilai yang dikembalikan yang ada  di dalam blok lambda
    val message = "Hello Kotlin!"
    val result1 = with(message){
        "First character is ${this[0]}"+
                " and last character is ${this[this.length -1]}"
    }
    println(result1)
    //apply , nilai yang dikembalikan dari fungsi apply adalah nilai dari konteks objeknya dan obek konteksnya sebagai receiver(this).
    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin !")
    println(builder.toString())

    //DENGAN APPLY bisa menuliskan seperti ini
    val message1= StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }
    println(message1.toString())
}

//pemggunaan fungsi apply mengakses konteks dari sebuah objek // lambda receiver
val buildString = StringBuilder().apply {
    append("hello")
    append("kotlin")
}

//lambda argument (it) untuk mengakses konteks dari sebuah objek adalah fungsi let dan also
//val text = "Hello"
//text.let { value ->
//    val message = "$value Kotlin"
//    println(message)
//}
