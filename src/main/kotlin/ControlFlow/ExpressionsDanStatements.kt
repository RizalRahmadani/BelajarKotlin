package ControlFlow

fun main() {
    //contoh statement
    // karena tidak mengembalikan nilai apapun
    val openOffice = 7
    val now = 8
    if (now > openOffice)
        print("Office already open")
    else
        print("Office close")

    //contoh expression
    //karean mengembalikan nilai dan bisa disimpan ke dalam sebuah variabel
    val openOffice1 = 7
    val now1 = 8
    val office = if (now1 > openOffice1) "Office already open" else "Office close"
    print(office)


}