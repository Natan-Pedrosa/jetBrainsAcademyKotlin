// Read two integers a and b. Print the sum of all the integers from a tob inclusive. It is guaranteed that a <b.
fun main() {
    val min = readln().toInt()
    val max = readln().toInt()

    var res = 0

    for (value in min..max) {
        res += value
    }

    println(res)
}