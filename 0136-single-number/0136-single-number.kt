class Solution {
  fun singleNumber(nums: IntArray): Int {
    var ans = 0
    for (i in nums.indices) ans = ans xor nums[i]
    return ans
}

}