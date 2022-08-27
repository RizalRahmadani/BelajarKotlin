package KonsepFunctionalPrograming

fun main() {

}
//memberikana nama alternatif pada sebuah function type menggunakan kata kunci typealias
typealias Arithmatic = (Int, Int) -> Int

val sum:Arithmatic = {valueA, valueB -> valueA + valueB}

val multiply: Arithmatic = {valueA, valueB -> valueA * valueB}

       //membuat instance dari sebuah function type memanfaatkan operator invoke()
//val sumResult = sum.invoke(10,10)
//val multiplyResult = multiply.invoke(20,20)
    //bisa menuliskan secara langsung menghilangkan operator invoke
val sumResult = sum(10,10)
val multiplyResult = multiply(20,20)

//menandai function type sebagai nullable
typealias Aritmatic =((Int , Int)->Int)?
val jumlah: Aritmatic = {valueA, valueB -> valueA + valueB}

