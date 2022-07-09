open class myCar(val name: String, val cc: Int, val harga: Double, val warnamobil: String){

    open fun namaMobil(){
        println("$name 1")
    }

    open fun ccMobil(){
        println("$cc 2")
    }

    open fun hargaMobil(){
        println("$harga 3")
    }

    open fun warnaMobil(){
        println("$warnamobil 2")
    }
}

class Mobil(pName: String, pCc: Int, pHarga: Double, pWarnamobil: String, val isCar: Boolean, val transmisi: String)
    : myCar(pName, pCc, pHarga, pWarnamobil) {

    override fun namaMobil(){
        println("nama mobil saya $name")
    }

    override fun ccMobil() {
        println("kekuatan $name adalah $cc")
    }

    override fun hargaMobil(){
      println("harga $name adalah $harga")
    }

    override fun warnaMobil(){
      println("warna $name adalah $warnamobil")
    }
}

fun main(){
    val mobilSaya = Mobil("Mobilio", 1000, 120.5, "Kuning", true, "Automatic")

    mobilSaya.namaMobil()
    mobilSaya.ccMobil()
    mobilSaya.hargaMobil()
    mobilSaya.warnaMobil()
}