package objectorientation
/*
// classe abstrata nao e instanciada, e usada apenas numa hierarquia
abstract class Animal(val name: String){

    open fun sayMyName(){
        println("Meu nome é $name")
    }

    // funcao abstrata obriga a classe filha a sobrescrever o metodo
    // nao recebe corpo
    abstract fun talk()

}

// classe filha Mammal recebe funcionalidade da classe pai Animal
open class Mammal(name: String, var age: Int): Animal(name){

    override fun talk() {
        println("Olá, eu sou o Goku")
    }

}

// classe Cat herda metodos dos pais
class Cat: Mammal("Braite", 4){
    override fun talk() {
        super.talk()
        println("Miau")
    }
}

fun main(args: Array<String>){

    val n1 = Mammal("Panda", 100)
    val n2 = Mammal("Capivara", 40)
    val n3 = Cat()

    n1.sayMyName()
    n2.sayMyName()
    n3.talk()

}

*/