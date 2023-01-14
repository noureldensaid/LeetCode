class Solution {
  
  fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val hash1 = hashMapOf<Char, Int>()
    val hash2 = hashMapOf<Char, Int>()
    for (i in s.indices) {
        hash1[s[i]] = 1 + hash1.getOrDefault(s[i], 0)
        hash2[t[i]] = 1 + hash2.getOrDefault(t[i], 0)
    }
    hash1.keys.forEach {
        if (hash1[it] != hash2.getOrDefault(it, 0)) return false
    }
    return true
}

    
    
    
}