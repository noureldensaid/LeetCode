class Solution {
    fun sortColors(nums: IntArray) {
        var low = 0
        var mid = 0
        var high = nums.size - 1

        while (mid <= high) {
            when (nums[mid]) {
                0 -> {
                    swap(nums, low, mid)
                    low++
                    mid++
                }
                1 -> {
                    mid++
                }
                2 -> {
                    swap(nums, mid, high)
                    high--
                }
            }
        }
    }

    private fun swap(nums: IntArray, i: Int, j: Int) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}
