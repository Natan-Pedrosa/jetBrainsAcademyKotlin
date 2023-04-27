import kotlin.math.abs

// get last digit of number
// write your code here

fun getLastDigit(number: Int): Int {

    return abs(number % 10)
}

fun main() {
    val a = readln().toInt()
    println(getLastDigit(a))
}