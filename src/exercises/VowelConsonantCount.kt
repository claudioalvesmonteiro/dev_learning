package exercises


fun countVowelConsonant(str: String): String {

    var countVowel: Int = 0
    var countConsonant: Int = 0

    for (caractere in str) {

        when (caractere) {
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U' -> countVowel++

            else -> countConsonant++
        }

    }

    return """
        Number of vowels: $countVowel
        Number of consonants: $countConsonant
        """.trimIndent()

}

val strTest = "uma outrA frAse de testeeeee"


fun main(args: Array<String>){

    println(countVowelConsonant(strTest))
}