package basic

import java.util.*

// function to evaluate multiple years
fun whaaat(year: Int): String{

    if (year == 2017)
        return "OSAR"
    else if (year == 2018)
        return "me formei"
    else
        return "to por fora"
}

// function to evaluate multiple years with WHEN
fun whaat(year: Int): String{

    // conditional to evaluate multiple values
    when (year){
        2017 -> return "OSAR"
        2018, 2019, 2020 -> return "me formei"
        else -> return "to por fora"
    }
}


fun main(args: Array<String>){

    val calendar: Calendar = Calendar.getInstance() // captura intancia da classe Calendar
    val year = calendar.get(Calendar.YEAR) // acessa propriedade YEAR

    println(whaat(year))
    println(whaaat(year))

}