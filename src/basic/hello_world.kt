package basic

fun minhaPrimeiraFunc(nome: String = "visitante"){
    println(nome)
}

fun main (args: Array<String>) {
    print("Dalee ")
    minhaPrimeiraFunc("Craudi")

}

/*

fun main(args: Array<String>){
    print("Olá ")
    showDebola(if (args.size > 0 ) args[0] else "Visitante") // testa se recebeu alguma informacao e printa a info ou alternativa visitante
}

fun showDebola(name: String){
    println(name)
}
*/