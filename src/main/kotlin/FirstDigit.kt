fun main() {
    val letters = readln()

    for (letter in letters) {
        if (letter.isDigit()) {
            print(letter)
            break
        }
    }
}