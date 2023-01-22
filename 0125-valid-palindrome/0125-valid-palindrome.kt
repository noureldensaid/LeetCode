class Solution {
   val re = Regex("[^A-Za-z0-9]")
    fun isPalindrome(s: String): Boolean {
        val cleanString = re.replace(s, "").toLowerCase()
        return if (cleanString == cleanString.reversed()) true else false
    }
}