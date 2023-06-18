class Solution {
    fun sortColors(nums: IntArray): Unit {
        var lt = -1
        var gt = nums.size
        var index = 0
        while (index < gt) {
            when(nums[index]) {
                0 -> { swap(nums, index++, ++lt) }
                1 -> { index++ }
                2 -> { swap(nums, index, --gt) }
            }
        }
    }

    fun swap(nums: IntArray, i: Int, j: Int) {
        var temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}