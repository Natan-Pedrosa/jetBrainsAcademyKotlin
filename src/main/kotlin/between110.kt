const val MIN = 1
const val MAX = 10

fun main (){
    val number = readln().toInt()
    val betweenOneTen = number !in MIN..MAX

    println(betweenOneTen)
}