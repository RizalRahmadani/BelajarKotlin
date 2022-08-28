package KonsepFunctionalPrograming

import com.sun.xml.internal.ws.api.message.Message

// contoh dari sebuah inner function(function lokal)

fun setWord(message: String){
//    fun printMessage(text:String){
//        println(text)
//    }
//    printMessage(message)

    //atau megakses parameter dari function setWord
    fun printMessage(){
        println(message)
    }
    printMessage()

}

//CONTOH TIDAK MENGGUNAKAN INNER FUNCTION MAKA KODE AKAN BERULANG
fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    if (valueA == 0) {
        throw IllegalArgumentException("valueA must be better than 0")
    }

    if (valueB == 0) {
        throw IllegalArgumentException("valueB must be better than 0")
    }

    if (valueC == 0) {
        throw IllegalArgumentException("valueC must be better than 0")
    }

    return valueA + valueB + valueC
}

//PERBANDINGAN SETELAH MENGGUNAKAN INNER FUNCTION

fun penjumlahan(valueA: Int, valueB: Int, valueC: Int): Int{
    fun validateNumber(value:Int){
        if (value == 0){
            throw IllegalArgumentException("value must be better than 0")
        }
    }
    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB + valueC
}

//menjadikan inner function menjadi extension function

fun pengurangan(valueA: Int, valueB: Int, valueC: Int): Int{
    fun Int.validateNumber(){
        if (this == 0){
            throw IllegalArgumentException("value must be better than 0")
        }
    }
    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()


    return valueA - valueB - valueC
}