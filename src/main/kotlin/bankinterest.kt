const val INTEREST_RATE = 1.071
const val MAX_VALUE = 700000

fun findYears(depo: Double): Int{
    var deposit = depo

    var years = 0
    //
    // implement the while loop here
    while (deposit < MAX_VALUE) {
        deposit *= INTEREST_RATE

        years++
    }
    return years
}

fun main() {
    println("Digit the number of deposit:")
    val deposit = readln().toDouble()

    println(findYears(deposit))
}