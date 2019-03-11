package functions/*
package basic

fun hello(){
    println("Olar")
}

fun toUpper(str: String) : String {
    return str.toUpperCase()
}

fun firstLetter(str: String, index: Int) : Char {
    return str[index]
}

fun whichNumberIsBigger(num1 : Int, num2: Int){
    if (num1 > num2){
        println(num1)
    }
    else if (num2 > num1){
        println(num2)
    }
    else {
        println("They are equal")
    }
}

// main function
fun main(args: Array<String>){

    hello()
    println(toUpper("OpA! boa nOite!"))
    println(firstLetter("É nada", 3))

    whichNumberIsBigger(10, 10)
}

*/