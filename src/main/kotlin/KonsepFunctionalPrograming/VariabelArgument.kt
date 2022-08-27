package KonsepFunctionalPrograming




fun main() {

    //vararg (varibel argument)
//satu parameter vararg bisa melampirkan beberapa argumen
    val number = sumNumbers(10,20,30,40)
    println(number)

    //extensions functions
    10.printInt()
    println(10.plusThree())

    //extension properties
    println(10.slice)
}

//menggunakan parameter vararg
fun sumNumbers(vararg number: Int): Int{
    return number.sum()
}

//menerapkan generic untuk tipe parameter ketika parameter tersebut di tentukan dengan vararg\
fun <T> asList(vararg input:T): List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result

}
// extension functions
// format fun,receiver type,nama fungsi

fun Int.printInt(){
    println("value $this")

}
fun Int.plusThree(): Int {
    return this +3
}

//extension properties
val Int.slice:Int
    get() = this / 2