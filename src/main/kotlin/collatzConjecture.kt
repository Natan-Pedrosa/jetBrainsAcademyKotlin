/*
You have a natural number n. Generate a sequence of integers, described in the Collatz conjecture (Wikipedia):

if n is an even number, divide it in half;
if it is odd, multiply it by 3 and add 1 ;
Repeat this operation until you get 1 as a result.

For example, if n is 17, then the sequence would look like this:

17 52 26 13 40 20 10 5 16 8 4 2 1
This sequence should stop at 1 for any primary natural number n.

Output format:
A sequence of integers in a single line, separated by spaces.
 */

fun main() {
    var number = readln().toInt()

    print(number)

    while(number > 1) {

        number = if(number % 2 == 0) number / 2 else number * 3 + 1

        print(" $number")
    }
}