
fun main() {
    val dna = readln()
    var newDNA = ""

    var newChar = dna[0]
    var count = 0
    for (letter in dna) {
        if (letter == newChar) {
            ++count
        } else {
            newDNA += newChar.toString() + count.toString()
            newChar = letter
            count = 1
        }
    }
    newDNA += newChar.toString() + count.toString()
    print(newDNA)
}
