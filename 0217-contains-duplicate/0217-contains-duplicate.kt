class Solution {
fun containsDuplicate(nums: IntArray): Boolean {
    val hash = HashMap<Int, Int>()
    for (i in nums.indices) {
        if (hash.containsKey(nums[i])) return true
         hash.put(nums[i],i)
    }
    return false
}

    
}