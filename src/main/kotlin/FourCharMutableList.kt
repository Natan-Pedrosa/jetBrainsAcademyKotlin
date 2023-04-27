/*
Create a mutable list of chars named characters with four elements: a, z, e, and d. After that, please, output it.

Use the provided code template
 */

fun main() {
    val character = mutableListOf<Char>('a', 'z', 'e', 'd')

    println(character)
    println(character.joinToString("-"))
    val emptyL = mutableListOf(1)
}