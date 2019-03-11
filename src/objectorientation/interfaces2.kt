package objectorientation

interface Interface1 {

    fun hello(){
        println("Olá interface 1")
    }

}

interface Interface2 {

    fun hello(){
        println("Olá interface 2")
    }

}

class ImplementsInterface : Interface1, Interface2{
    override fun hello() {
        super<Interface1>.hello()
        super<Interface2>.hello()
    }
}

fun main(args: Array<String>){

    val a1: ImplementsInterface = ImplementsInterface()
    a1.hello()

}