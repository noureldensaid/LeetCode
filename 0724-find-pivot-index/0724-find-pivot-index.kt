class Solution {
 fun pivotIndex(nums: IntArray): Int {
    val sum = nums.sum()
    var left = 0
    for (i in nums.indices) {
        val right = sum - left - nums[i]
        if (left == right) return i else left += nums[i]
    }
    return -1
}

}