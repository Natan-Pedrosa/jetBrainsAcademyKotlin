/*
Write a program that capitalizes all letters after the last u symbol in a word
(all letters after last 'u' should be uppercase) and prints the resulting string.
 */
fun main() {
    val word = readln()

    var hasUpdateUpper = false
    var trackUpper = ""

    for (letter in word) {
        if (hasUpdateUpper) {
            trackUpper += letter
        }

        if (letter == 'u') {
            hasUpdateUpper = true
            trackUpper = ""
        }
    }
    println(word.replace(trackUpper, trackUpper.uppercase()))
    bestSolution()
}

fun bestSolution() {
    val word = readln()
    val solution = word.replaceAfterLast("u", word.substringAfterLast("u").uppercase())

    println(solution)
}