/*
Two numbers in a row
Write a program that reads a list of integers and two numbers: p and m. The program is to check that p and m never occur next to each other (in any order) in the list.

Input data format

The first line contains the size of a list, N.
The next N lines contain the elements of the list.
The last line contains two integer numbers p and m separated by space.

Output data format

Print "NO" if the numbers are next to each other or "YES" if p and m are never near each other
 */

fun main() {
    val size = readln().toInt()
    val list: MutableList<Int> = mutableListOf()

    for (i in 0 until size) {
        list.add(readln().toInt())
    }

    val (p, m) = readln().split(" ").map { it.toInt() }

    for (index in 0 until list.lastIndex) {
        if ((list[index] == p && list[index + 1] == m) || (list[index] == m && list[index + 1] == p)) {
            println("NO")
            return
        }
    }
    println("YES")
}