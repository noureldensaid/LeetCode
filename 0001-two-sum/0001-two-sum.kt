class Solution {
  fun twoSum(nums: IntArray, target: Int): IntArray? {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[j] == target - nums[i]) {
                return intArrayOf(i, j)
            }
        }
    }
    // In case there is no solution, we'll just return null
    return null
}
}