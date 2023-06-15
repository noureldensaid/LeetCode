class Solution {
fun fib(n: Int): Int {
    val fib = hashMapOf<Int, Int>().withDefault { 0 }
    fib[0] = 0
    fib[1] = 1
    for (i in 2..n) {
        fib[i] = fib[i - 1]!! + fib[i - 2]!!
    }
    return fib[n]!!
}
}