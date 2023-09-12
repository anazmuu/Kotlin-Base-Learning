fun main(){
    println("Vararg Sum : ")
    println(bilangan(5,4,6,7,3,5,1,4,5,6,7,8,9,1,2))
    println("Vararg Foreach : ")
    println(looping(12,34,5,6,7,8,9,2,4,5,6))
}

fun bilangan(vararg angka: Int): Int{
    var result = 0
    for (number in angka){
        result += number
    }
    return result

}

fun looping(vararg angka: Int){
    angka.forEach { println(it) }
}