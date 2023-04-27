import kotlin.math.sqrt

/*
Residents of Malevia like to experiment with their rooms. Rooms can be triangular, rectangular, and circle-type.
To calculate the area, they need a program that gets the type of room shape and the relevant arguments as input.
The program should output the room area.

Malevians use 3.14 for π.
 */

fun main() {
    val areaRoom = readln()

    when (areaRoom) {
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()

            println(areaTriangle(a, b, c))
        }
        "rectangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val area = a * b
            
            println(area)
        }
        "circle" -> {
            val r = readln().toDouble()
            val area = r * r * 3.14
            
            println(area)
        }
    }
}

fun areaTriangle(a: Double, b: Double, c: Double):Double {
    val perimeter = (a + b + c) / 2
    val area = sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c) )
    return area
}

