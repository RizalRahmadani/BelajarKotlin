package KonsepFunctionalPrograming

fun main() {
//    printResult(10,sum)
    //secara langsung menerapkan fungsi lambda
    printResult(10){value -> value+value}
}

//beberapa tipe mendeklarasikan lambda

//var sum: (Int) -> Int = { value -> value + value }

//menggunakan lambda sebagai argumen difungsi lain
fun printResult(value:Int, sum:(Int) -> (Int)){
    val result = sum(value)
    println(result)
}