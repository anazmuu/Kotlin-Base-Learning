
fun main(args: Array<String>) {
    sendMessage(
        name = "Mulki"
    )
    aplikasi(
        nameApps = "GTA VI",
        publisher = "Rockstar",
        year = 2024
    )
}

fun aplikasi(nameApps: String, publisher: String, year: Int) {
    println("Name       : $nameApps")
    println("Publisher  : $publisher")
    println("Tahun      : $year")
}

fun sendMessage(name: String = "User", message: String = sendText()) {
    println("Name = $name and message = $message")
}

fun sendText() = "Text Sending..."
