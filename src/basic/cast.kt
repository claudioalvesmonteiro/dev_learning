// CAST
package basic


// transforming variables
fun main(args: Array<String>){

    val number: Int = 10
    val longNumber: Long = 100

    var n1:Int
    n1 = longNumber.toInt() // convert Long to Int
    println(longNumber)

    val strNum = "10"
    n1 = strNum.toInt() // convert String to Int

    println(n1)

}