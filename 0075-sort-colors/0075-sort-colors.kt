class Solution {
    fun sortColors(nums: IntArray) {
        var left = 0  // Boundary for the sorted red (0) elements
        var right = nums.size - 1  // Boundary for the sorted blue (2) elements
        var index = 0
        
        while (index <= right) {
            when (nums[index]) {
                0 -> {
                    swap(nums, index, left)
                    index++
                    left++
                }
                2 -> {
                    swap(nums, index, right)
                    right--
                }
                else -> {
                    index++
                }
            }
        }
    }

    private fun swap(nums: IntArray, i: Int, j: Int) {
        if(nums[i]!=nums[j])
       { val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp}
    }
}
