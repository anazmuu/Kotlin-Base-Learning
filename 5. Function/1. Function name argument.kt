fun main(){
  val namaLengkap = getNamaLengkap(first = "PBO", middle = "Sangat", last = "Menyenangkan")
  print(namaLengkap)
}

fun getNamaLengkap (first: String, middle: String, last: String): String {
  return "$first $middle $last"
}
