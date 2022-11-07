class Solution {
 private fun getDigitsSum(n: Int): Int {
        var x = n
        var total = 0
        while (x > 0) { // Get the sum of the digits squared
            val d = x % 10
            x /= 10
            total += d * d
        }
        return total
    }
    
    fun isHappy(n: Int): Boolean {
        var x = n
        val seenValues = HashSet<Int>() // Make sure we don't go to the same values again
        while (x != 1 && !(seenValues.contains(x))) {
            seenValues.add(x)
            x = getDigitsSum(x)
        }
        return x == 1 // We found a happy number!
    }
}