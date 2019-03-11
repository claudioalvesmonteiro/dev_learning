package exercises

import java.lang.StringBuilder

fun reverseSB(str: String): String{
    return StringBuilder(str).reverse().toString()
}

fun reverseLoop(str: String):String{

    var contador = str.length - 1
    var str_invertida = ""

    while (contador >= 0){
        str_invertida += str[contador]
        contador--
    }

    return str_invertida
}
