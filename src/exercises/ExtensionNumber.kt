package exercises

import java.math.BigDecimal
import java.math.RoundingMode

fun Float.percentOf(value: Float): Float {

    // THIS SERA A VARIAVEL/VALOR AO QUAL O METODO SERA APLICADO
    return (this / value)*100

}

fun Float.customPrecision(precision: Int): Float {

    // arredonda o valor (this) a partir do input de casas decimais (precision)
    return BigDecimal(this.toString()).setScale(precision, RoundingMode.HALF_UP).toFloat()

}

/*
// TEST
fun main(args: Array<String>){

    println(33.0f.percentOf(91919.0f).customPrecision(3))
}
*/