class Solution {
  fun longestPalindrome(s: String?): Int {
    if (s == null || s.isEmpty()) return 0
    val set = HashSet<Char>()
    var count = 0
    for (i in s.indices) {
        if (set.contains(s[i])) {
            set.remove(s[i])
            count++
        } else set.add(s[i])
    }
    return if (set.isNotEmpty()) count * 2 + 1 else count * 2
}

}