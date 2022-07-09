class Hewan{
    var name: String = "Ayam Berkokok"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

// main function
fun main(){
    val ayamAyam = Hewan()
    println("Nama: ${ayamAyam.name}" )
    ayamAyam.name = "Kukuruyukk"
    println("Nama: ${ayamAyam.name}")
}

//Ini adalah contoh kode bagaimana sebuah properti menyediakan fungsi getter setter