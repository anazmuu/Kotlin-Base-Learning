val sum: (Int, Int) -> Int = { valueA, valueB -> valueA + valueB }

val multiply: (Int, Int) -> Int = { valueA, valueB -> valueA * valueB }

fun main() {
    val sumHasil = sum.invoke(10, 10)
    val multiplyHasil = multiply.invoke(20, 20)

    println(sumHasil)
    println(multiplyHasil)
}