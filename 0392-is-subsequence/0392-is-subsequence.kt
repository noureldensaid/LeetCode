class Solution {
  fun isSubsequence(s: String, t: String): Boolean {
    var a = 0
    var b = 0
    if (s.isEmpty()) return true
    if (t.isEmpty()) return false
    while (b < t.length) {
        if (s[a] == t[b]) {
            a++
            b++
        } else {
            b++
        }
        if (a == s.length) return true
    }
    return false}

}