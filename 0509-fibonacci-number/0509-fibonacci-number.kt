class Solution {
fun fib(n: Int): Int {
    val fib = mutableListOf<Int>()
    fib.add(0)
    fib.add(1)
    for (i in 2..n) {
        fib.add(i, fib[i - 1] + fib[i - 2])
    }
    return fib[n] 
}
}