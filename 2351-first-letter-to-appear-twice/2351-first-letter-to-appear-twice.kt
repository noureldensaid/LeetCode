class Solution {
    fun repeatedCharacter(s: String): Char {
         val hash = hashMapOf<Char, Int>()
    for (i in 0..s.length) {
        if (hash.containsKey(s[i])) {
            return s[i]
        }
        hash[s[i]] = i
    }
    return ' '
    }
}