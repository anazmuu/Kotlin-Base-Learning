open class Animal3(val name2: String, protected val weight: Double)

class Cat2(pName: String, pWeight: Double) : Animal3(pName, pWeight)


fun main() {
    val Cat2 = Cat2("Miaw Kocheng", 2.0)
    println("Nama Kucing: ${Cat2.name2}")
    // println("Berat Kucing: ${cat.weight}") <- Cannot access 'weight': it is protected in 'Cat'
}
