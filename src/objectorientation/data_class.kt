package objectorientation

// data class carrega apenas valores e nao metodos,
// é usado quando se deseja transferir valores por conta de suas funcionalidades

data class Person(val name: String, val age: Int)

fun main(args: Array<String>){

    val p1 = Person("Geórgia", 22)
    val p2 = Person("Geórgia", 22)
    val p3 = p1

    println(p1.toString())
    println(p1.equals(p2)) // compara nao os valores, mas as referencias
    println(p1.equals(p3))

    val p4 = p1.copy()
    println(p4.equals(p1))

}