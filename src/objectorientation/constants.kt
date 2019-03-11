package objectorientation

import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS

// variaveis estaticas sao alocadas fora da classe
// pode acessa-la apenas pelo nome da classe

class Math{

    //
    object Constante{
        val PI: Double= 2.1415

        fun sayValue(){
            println("Meu valor é $PI")
        }

    }

    companion object Companion {
        val PI: Double = 2.1416

        fun sayMyValue(){
            println("Meu valor é $PI")
        }
    }


}

fun main(args: Array<String>){

    Math.Companion.sayMyValue()
    Math.Constante.sayValue()

}