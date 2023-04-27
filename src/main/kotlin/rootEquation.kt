import kotlin.math.pow

/*
There are numbers a,b,c,d. Output in ascending order all the integers between 0 and 1000 (inclusively), which are the roots of the equation
a⋅x
3
 +b⋅x
2
 +c⋅x+d=0
. The roots of a cubic equation are the values of the variable that satisfy the equation.

If a specified interval does not contain any roots of the equation, do not output anything.
*/

const val MIN_RANGER = 0
const val MAX_RANGER = 1000

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()

    for (x in MIN_RANGER..MAX_RANGER) {
        val res = a * x * x * x + b * x * x + c * x + d

        if (res == 0) {
            println(x)
        }
    }
}