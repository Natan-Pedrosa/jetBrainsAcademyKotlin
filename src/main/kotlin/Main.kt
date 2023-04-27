fun main(args: Array<String>) {
    //test2()
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i, j = $j")
            if (j == 3) break@loop
        }
    }
}

fun teste1() {
    val number = readln().toInt()

    var larger = 0
    var small = 0
    var perfect = 0

    repeat(number) {
        when(readln().toInt()) {
            1 -> larger++
            -1 -> small++
            0 -> perfect++
        }
    }

    println("$larger $small $perfect")
}

fun test2() {
    val chars = charArrayOf('H', 'Y', 'P', 'E', 'R', '-', 'S', 'K', 'I', 'L', 'L' )

    val stringFromChars = String(chars)

    val strings = stringFromChars.split("-")
    println(strings )
}