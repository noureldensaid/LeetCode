class Solution {
fun longestPalindrome(s: String): Int {
    val count = IntArray(128)
    for (c in s) count[c.toInt()]++
    var ans = 0
    for (v in count) {
        ans += v / 2 * 2
        if (ans % 2 == 0 && v % 2 == 1) ans++
    }
    return ans
    }

}