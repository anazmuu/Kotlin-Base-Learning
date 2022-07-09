class Fish(val name: String, val weight: Double, val age: Int, val isPisces: Boolean)

fun main() {
    val nemoFish = Fish("FindingNemo", 4.2, 2, true)
    println("Nama: ${nemoFish.name}, Berat: ${nemoFish.weight}, Umur: ${nemoFish.age}, mamalia: ${nemoFish.isPisces}")
}