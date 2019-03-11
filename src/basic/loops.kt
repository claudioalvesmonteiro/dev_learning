package basic

fun main(args: Array<String>){

    // FOR loop
    for (x in 1..10){
        println(x)
    }

    // WHILE loop
    var index = 1
    while (index <= 10){
        println(index)
        //index = index + 1
        index++
    }

    // DO WHILE loop
    do{
        println(index)
        index++
    } while(index < 0)
}


