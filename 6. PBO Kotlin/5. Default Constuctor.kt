class Burung{
    val name: String = "Burung Lakbeud"
    val weight: Double = 1.2
    val age: Int = 1
    val isAves: Boolean = true
}

fun main(){
    val myBurung = Burung()
    println("Nama: ${myBurung.name}, Berat: ${myBurung.weight}, Umur: ${myBurung.age}, mamalia: ${myBurung.isAves}" )
}