package basic

import java.lang.Exception

// TRY CATCH
fun main(args: Array<String>){

    try{
        var number = "opa".toInt()
    }
    catch (e: Exception){
        println("Algum erro aconteceu o.O tente novamente!")
    }

    finally {
        println("Rodou")
    }
}