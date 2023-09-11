import java.security.KeyStore.TrustedCertificateEntry

fun main() {
    greetings()
    sayHello( name = "Dini", 22)

    val sessionLogin = false
    if(sessionLogin){
        loginSuccess(status = "Login")
    }else{
        loginFailed()
    }
}

fun greetings() {
    val hallo = "Bonjour"
    println("$hallo Mulki")
}


//with parameter
fun sayHello(name: String, age: Int){
    println("Hello, $name")
    println("Umur $age")
}

fun loginSuccess(status: String){
    println("Selamat anda berhasil $status")
}

fun loginFailed(){
    println("Kamu gagal Login")
}
