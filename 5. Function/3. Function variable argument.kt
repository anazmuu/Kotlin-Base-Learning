// main function
fun main() {
    val number = sumAngka(10, 20, 30, 40, 50)
    print(number)
}

fun sumAngka(vararg number: Int): Int {
    return number.sum()
}