package objectorientation

import javax.swing.AbstractListModel

// classe é tipo de 'molde' que pode gerar objetos,
// objetos que são uma instância de determinada classe

class Car (initModel: String, initPower: Float = 1.0f, initMaxSpeed: Int){
    //    (var model: String, var power: Float = 1.0f, var maxSpeed: Int)

    // printar uma mensagem cada vez que um objeto for instanciado
    init {
        println("Use o sinto de segurança")
    }

    // tudo que é declarado é compreendido pelo kotlin como propriedade
    // assim ele já cria o get e o set
    var model: String = initModel
    var power: Float = initPower
    var maxSpeed = initMaxSpeed

    // criar variavel interna, passivel apenas de leitura,
    // ou transformada a partir de metodos
    var currentSpeed = 0
        private set

    override fun toString(): String {
        return "Car(model='$model', power=$power, maxSpeed=$maxSpeed)"
    }

    fun speedUp(){
        println("Acelerando... velocidade atual: ${++currentSpeed}")
    }

    fun speedBreak(){
        println("Freiando... velocidade atual: ${--currentSpeed}")
    }


}

fun main(args: Array<String>){

    val camaro = Car("Camaro", 4.2f, 250)
    val ferrari = Car("Ferrari", 6.2f, 350)
    val onix = Car("Onix", initMaxSpeed = 150)

    camaro.speedUp()
    camaro.speedUp()
    camaro.speedUp()
    camaro.speedBreak()

    println(camaro)
    println(ferrari)
    println(onix)
}