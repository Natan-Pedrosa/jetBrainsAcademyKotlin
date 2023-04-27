/*
 */

fun main () {
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    // write your code here
    println("${inputList.first()[0]} ${inputList.first()[inputList.lastIndex]}")
    println("${inputList.last()[0]} ${inputList.last()[inputList.lastIndex]}")
}