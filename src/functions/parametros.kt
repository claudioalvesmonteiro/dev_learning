package functions


fun writeAdress(street: String, city: String = "", state: String, cep: String = ""){
    println("Rua: $street")
    println("Cidade: $city, $state - $cep")
}


fun main(args: Array<String>){
    writeAdress("Rua do Kotlin", "Recife", "PE", "50610-150")
    writeAdress("Rua do Kotlin", state = "PE")
}

