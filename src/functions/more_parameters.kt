package functions

fun <T> manyParameters(vararg name: T){

    for (parametro in name){

        if (parametro is String){
            println("$parametro é String")
        }

        else if (parametro is Int){
            println("$parametro é Int")
        }

        else {
            println("Informação não reconhecida")
        }
    }
}

fun main(args: Array<String>){
    manyParameters("1", "ent", 234, 22, "opa", 3)
}