package exercises

// recebe N inteiros como parametros e os soma
fun sumAllParameters(vararg values: Int): Int{

    return values.sum()
}

// recebe N parametros soma inteiros e float
fun <T> sumAllGenericsParameters(vararg name: T): Double{

    var count: Double = 0.0

    for (i in name){

        if (i is Int){
            count = count + (i.toDouble())
        }

        else if (i is Float){
            count = count + i.toDouble()
        }

        else if (i is Double){
            count = count + i
        }
    }

    return count


}
