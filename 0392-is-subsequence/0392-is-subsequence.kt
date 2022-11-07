class Solution {
  fun isSubsequence(s: String, t: String): Boolean {
    var a = 0
    var b = 0
    while (b < t.length && a < s.length) {
        if (s[a] == t[b]) {
            a++
            b++
        } else b++
    }
    return a == s.length
  }
}