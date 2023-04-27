/*
Create an euphonious word
All the letters of the English alphabet are divided into vowels and consonants.
The vowels are: a, e, i, o, u, y.
The remaining letters are consonants.

A word is considered euphonious if it doesn't have three or more vowels or consonants in a row. Otherwise,
it is considered discordant.

Your task is to create euphonious words from the discordant ones. You can insert any letters inside the word.
Output the minimum number of characters needed to create a euphonious word from a given word.

For example, the word "schedule" is considered discordant because it has three consonants in a row: "sch".
To create a euphonious word you need to add any vowel between 's' and 'c' or between 'c' and 'h'.
 */
const val VOWALS = "aeiouy"
const val MIN_DISCORDANT = 3

fun main() {
    val word: String = readln().lowercase()

    val sequenceConsonants = mutableListOf<String>()
    var sequence = ""
    for (letter in word) {
        if (letter !in VOWALS) {
            sequence += letter
        }else {
            if (sequence.isNotEmpty()) {
                sequenceConsonants.add(sequence)
                sequence = ""
            }
        }
    }

    if (sequence.isNotEmpty() && sequence.length >= MIN_DISCORDANT) {
        sequenceConsonants.add(sequence)
    }

    sequence = ""
    val sequenceVowas = mutableListOf<String>()
    for (letter in word) {
        if (letter in VOWALS) {
            sequence += letter
        }else {
            if (sequence.isNotEmpty()) {
                sequenceVowas.add(sequence)
                sequence = ""
            }
        }
    }

    if (sequence.isNotEmpty() && sequence.length >= MIN_DISCORDANT) {
        sequenceVowas.add(sequence)
    }
    var countDiscordant = getNumberToCreateEuphonious(sequenceConsonants)
    countDiscordant += getNumberToCreateEuphonious(sequenceVowas)

    println(sequenceConsonants)
    println(sequenceVowas)
    println(countDiscordant)
}

fun getNumberToCreateEuphonious(list: MutableList<String>): Int {
    var countDiscordant = 0

    for (index in 0..list.lastIndex) {
        val size = list[index].length
        if (size >= MIN_DISCORDANT) {
            val iseven = size % 2 == 0
            countDiscordant = if (iseven) {
                countDiscordant + size / 2 - 1
            } else {
                countDiscordant + (size + 1) / 2 - 1
            }
        }
    }
    return countDiscordant
}

fun bestSolution1() {
    val input = readln()
    val pattern = "([aeiouy]{3,}|[bcdfghjklmnpqrstvwxz]{3,})"
    print(Regex(pattern).findAll(input).sumOf { (it.value.length - 1) / 2 })
}