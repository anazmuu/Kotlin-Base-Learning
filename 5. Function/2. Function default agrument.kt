// main function
fun main() {
    val fullName = getFullName()
    val fullName2 = getFullName2()
    println(fullName)
    print(fullName2)
}

fun getFullName(
        first: String = "Kotlin",
        middle: String = " is ",
        last: String = "Awesome"): String {
    return "$first $middle $last"
}

fun getFullName2(
        first2: String = "PBO",
        middle2: String = " itu ",
        last2: String = "Mengasyikan"): String {
    return "$first2 $middle2 $last2"
}


//Function Default Argument
//Ini adalah contoh kode deklarasi dan pemanggilan sebuah fungsi yang memanfaatkan default argument tanpa menyematkan argumen.