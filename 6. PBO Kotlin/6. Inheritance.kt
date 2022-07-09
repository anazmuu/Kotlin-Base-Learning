open class myPet(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){
        println("$name 1")
    }

    open fun sleep(){
        println("$name 2")
    }

    open fun berat(){
        println("$name 3 $weight")
    }
}

class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : myPet(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia!")
    }

    override fun eat(){
        println("$name sedang memakan ikan!")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal!")
    }

    override fun berat(){
      println("berat badan $name adalah $weight kg")
    }
}

fun main(){
    val kucingOren = Cat("Pussy Cat", 3.2, 2, true, "Brown", 4)

    kucingOren.playWithHuman()
    kucingOren.eat()
    kucingOren.sleep()
    kucingOren.berat()
}