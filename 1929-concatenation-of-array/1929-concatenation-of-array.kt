class Solution {
  fun getConcatenation(nums: IntArray): IntArray {
    val new = IntArray(nums.size * 2)
    for (i in new.indices) {
        new[i] = nums[i % nums.size]
    }
    return new
}

}