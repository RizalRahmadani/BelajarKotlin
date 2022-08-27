package ControlFlow

fun main() {

    //pengunaan continue untuk melewatkan jika nilai yang dihasilkan adalah null
    val listOfInt = listOf(1,2,3,null,5,null,7)
    for (i in listOfInt){
        if(i == null) continue
        println(i)
    }
    println()

    //menghintikan proses iterasi ketika nilai yang dihasilkan bernilai null
    for (j in listOfInt){
        if (j == null)break
        println(j)
    }

    println()

    //break and continue labels
    loop@ for (i in 1..10){
        println("Outsite Loop")

        for (j in 1..10){
            println("inside loop")
            if ( j > 5) break@loop
        }
    }
}