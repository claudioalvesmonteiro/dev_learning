package basic

// import java
import java.sql.Time
import java.time.LocalTime
import java.util.*


fun myPackage(){
    println("Olá")
}

fun myPackage2(){
    println("Opa lá")
}

fun main(args: Array<String>){

    // Accessing date and time
    val calendar: Calendar = Calendar.getInstance()
    println(calendar.get(Calendar.YEAR))
    val tempo: Time = Time.valueOf(LocalTime.now())
    println(tempo)
}

