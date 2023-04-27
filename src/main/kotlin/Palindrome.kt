fun main() {
    val word = readln()
    val isPalindrome = if(word == word.reversed()) "yes" else "no"
    print(isPalindrome)
}