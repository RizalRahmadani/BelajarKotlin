package KonsepFunctionalPrograming

fun main() {
    message()
    printMessage("hello from lamda message")

    //panggil lamda mengembalikan nilai
    val length = messageLength("hello my name is rizal rahmadani")
    println("Message length $length")

}

//menghindari boilerplate / mengulang bagian dari kode dibanyak tempat tanpa variasi
val comparator = object :Runnable{
    override fun run() {
        // TODO:
    }
}
//dengan lambda bisa disederhanakan
val comparator1 = Runnable{

}

//contoh deklarasi lambda
val message ={ println("hello from lambda") }

//menambahkan sebuah parameter pada fungsi lambda
val printMessage = { message : String -> println(message) }

//mendeklarasikan lambda agar bisa dapat mengembalikan nilai
val messageLength = { message: String -> message.length}
