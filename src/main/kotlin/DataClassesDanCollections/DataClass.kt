package DataClassesDanCollections


//clas untuk menggukana equals
class User(val name : String, val age : Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}
data class Datauser(val name : String, val age : Int){
    //menerapkan behavior di dalam data class
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main() {
    val user = User("nrohmen",17)
    val user2 = User("nrohmen",17)
    val user3 = User("dimas",24)
    val datauser = Datauser("nrohmen", 17)
    val datauser2 = Datauser("nrohmen", 17)
    val datauser3 = Datauser("nrohmen", 24)
    val datauser4 = datauser.copy() // mencopy atau menyalin sebuah objek
    val datauser5 = datauser.copy(age = 18)//mengcopy dan memodifikasi nilai objek

    //Destruturing Declarations proses memetakan objek menjadi sebuah variabel menggunkana keyword componentN()
    val name = datauser.component1()
    val age = datauser.component2()
    println("My name is $name, I am $age years old")

    //membuat beberapa variabel dari objek secara langsung dengan kode seperti berikut
    val (name1, age1) = datauser
    println("My name is $name1, I am $age1 years old")

    //memanfaatkan behaviour didalam data class
    datauser.intro()

//    println(user.equals(user2))
//    println(user.equals(user3))
//    println(datauser.equals(datauser2))
//    println(datauser.equals(datauser3))
    println(datauser4)
    println(datauser5)
}