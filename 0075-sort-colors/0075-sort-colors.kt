class Solution {
    fun sortColors(nums: IntArray): Unit {
        var left = -1
        var right = nums.size
        var index = 0
        while (index < right) {
            when(nums[index]) {
                0 -> { swap(nums, index++, ++left) }
                1 -> { index++ }
                2 -> { swap(nums, index, --right) }
            }
        }
    }

    fun swap(nums: IntArray, i: Int, j: Int) {
        var temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}