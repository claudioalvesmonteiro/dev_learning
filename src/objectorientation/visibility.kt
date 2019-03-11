package objectorientation

// private, protected, public

open class Carclass(val model: String){

    // protected variable can be accessed to son class
    protected open var velocity: Int = 0

    // private variable/method cant be accessed directly
    // outside the class, only through methods
    private var color: String = "blue"


    fun slowDown(){
        velocity--
    }

    open fun accelerate(){
        velocity++
    }

    fun showcolor(): String {
        return color
    }

}

open class Ferrari : Carclass("Ferrari"){

    var color = showcolor()

    override fun accelerate(){
        velocity++
        velocity++
    }

    fun showVelocityColor(){
        println("$model is $color and is running at $velocity km/h")
    }

}


fun main(args: Array<String>){

    val c1 = Carclass("Camaro")
    val c2 = Ferrari()

    // Loop corrida
    var contC = 0
    var contF = 0
    while (contC < 200){
        c1.accelerate()
        c2.accelerate()
        println("${c1.model} is at $contC speed")
        c2.showVelocityColor()
        contC++
        contF++
    }






}

