class Solution {
fun fib(n: Int): Int {
    val fib = HashMap<Int, Int>()
    fib[0] = 0
    fib[1] = 1
    for (i in 2..n) {
        fib[i] = fib[i - 1]!! + fib[i - 2]!!
    }
    return fib[n]!!
}
}