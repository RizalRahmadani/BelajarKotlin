package KonsepFunctionalPrograming

//function tanpa recursive
fun factorial(n: Int) : Int{
    return if( n==1){
        n
    }else{
        var result =1
        for (i in 1..n){
            result *=i
        }
        result
    }
}

//function dengan recursive
fun factorial1(n : Int): Int{
    return if (n==1){
        n
    }else{
        n*factorial1(n-1)
    }
}


//tail call recursion
tailrec fun factorial2(n:Int, result: Int =1):Int{
    val newResult = n*result
    return if(n ==1){
        newResult
    }else{
       factorial2(n-1,newResult)
    }
}
fun main() {
    println("Factorial 9999 is: ${factorial1(9999)}")
}