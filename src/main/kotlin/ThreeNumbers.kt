/*
Create a mutable list of longs named longs with three elements: 100_000_000_001, 100_000_000_002, and 100_000_000_003. Output the list.

Use the provided code template.
*/

fun main() {
    val numbers = MutableList(3) {
        when(it) {
            0 -> 100_000_000_001
            1 -> 100_000_000_002
            else -> 100_000_000_003
        }
    }


}