/*
Julia wants to get a job. By the laws of the country she lives in, she can have a job only if her age is within 18 to 59 years inclusive.

Depending on the input age, output true if she can get a job, otherwise output false.
* */
const val MIN_AGE_TO_WORK = 18
const val MAX_AGE_TO_WORK = 59

fun main() {
    val age = readln().toInt()
    println(age in MIN_AGE_TO_WORK..MAX_AGE_TO_WORK)
}