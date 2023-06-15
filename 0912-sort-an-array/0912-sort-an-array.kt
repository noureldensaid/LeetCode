class Solution {
    fun sortArray(nums: IntArray): IntArray {
        mergeSort(nums, 0, nums.size - 1)
        return nums
    }

    private fun mergeSort(nums: IntArray, left: Int, right: Int) {
        if (left < right) {
            val mid = left + (right - left) / 2
            mergeSort(nums, left, mid)
            mergeSort(nums, mid + 1, right)
            merge(nums, left, mid, right)
        }
    }

    private fun merge(nums: IntArray, left: Int, mid: Int, right: Int) {
        val leftSize = mid - left + 1
        val rightSize = right - mid

        val leftArray = IntArray(leftSize)
        val rightArray = IntArray(rightSize)

        for (i in 0 until leftSize) {
            leftArray[i] = nums[left + i]
        }
        for (j in 0 until rightSize) {
            rightArray[j] = nums[mid + j + 1]
        }

        var i = 0
        var j = 0
        var k = left

        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                nums[k] = leftArray[i]
                i++
            } else {
                nums[k] = rightArray[j]
                j++
            }
            k++
        }

        while (i < leftSize) {
            nums[k] = leftArray[i]
            i++
            k++
        }

        while (j < rightSize) {
            nums[k] = rightArray[j]
            j++
            k++
        }
    }
}
