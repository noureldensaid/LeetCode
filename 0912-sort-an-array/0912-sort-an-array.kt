class Solution {
    fun sortArray(nums: IntArray): IntArray {
            // Base case: if the array has 0 or 1 element, it is already sorted
    if (nums.size <= 1) {
        return nums
    }

    // Divide the array into two halves
    val mid = nums.size / 2
    val left = nums.sliceArray(0 until mid)
    val right = nums.sliceArray(mid until nums.size)

    // Recursively sort the two halves
    val sortedLeft = sortArray(left)
    val sortedRight = sortArray(right)

    // Merge the sorted halves
    return merge(sortedLeft, sortedRight)
}

fun merge(left: IntArray, right: IntArray): IntArray {
    val merged = IntArray(left.size + right.size)
    var leftIndex = 0
    var rightIndex = 0
    var mergedIndex = 0

    // Compare elements from the left and right arrays and merge them in ascending order
    while (leftIndex < left.size && rightIndex < right.size) {
        if (left[leftIndex] <= right[rightIndex]) {
            merged[mergedIndex] = left[leftIndex]
            leftIndex++
        } else {
            merged[mergedIndex] = right[rightIndex]
            rightIndex++
        }
        mergedIndex++
    }

    // Copy the remaining elements from the left array, if any
    while (leftIndex < left.size) {
        merged[mergedIndex] = left[leftIndex]
        leftIndex++
        mergedIndex++
    }

    // Copy the remaining elements from the right array, if any
    while (rightIndex < right.size) {
        merged[mergedIndex] = right[rightIndex]
        rightIndex++
        mergedIndex++
    }

    return merged

    }
}