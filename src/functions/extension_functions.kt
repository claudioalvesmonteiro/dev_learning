package functions

/*


Classe é um conceito que abriga alguns atributos, métodos e funções

val str: String = "" // STRING É CLASSE

str.length  // ATRIBUTO
str.toInt() // MÉTODO/FUNÇÃO

 */

// cria classe Person que possui o metodo speak()
class Person(){
    fun speak(){
        println("auuuuuu")
    }
}


fun main(args: Array<String>){

    // criar variavel person, da classe Person
    val person: Person = Person()

    // executar metodo speak na variavel person
    person.speak()

    // cria metodo walk para a classe Person
    fun Person.walk(){
        println(
            """Walk it like I talk it
               Walk it Walk it like I talk it
            """.trimMargin())
    }

    person.walk()

    // criar um metodo para a classe String
    // que retorna o primeiro caracter transformando-o
    // em string
    fun String.firstLetter(): String {

        return this[0].toString()
    }

    println("e n t".firstLetter())
}