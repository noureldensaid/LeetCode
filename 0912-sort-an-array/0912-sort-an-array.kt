class Solution {
    fun sortArray(nums: IntArray): IntArray {
        val tempArray = IntArray(nums.size)
        mergeSort(nums, 0, nums.size - 1, tempArray)
        return nums
    }

    private fun mergeSort(arr: IntArray, left: Int, right: Int, tempArr: IntArray) {
        if (left >= right) {
            return
        }
        val mid = (left + right) / 2
        mergeSort(arr, left, mid, tempArr)
        mergeSort(arr, mid + 1, right, tempArr)
        merge(arr, left, mid, right, tempArr)
    }

    private fun merge(arr: IntArray, left: Int, mid: Int, right: Int, tempArr: IntArray) {
        val start1 = left
        val start2 = mid + 1
        val size1 = mid - left + 1
        val size2 = right - mid

        for (i in 0 until size1) {
            tempArr[start1 + i] = arr[start1 + i]
        }
        for (i in 0 until size2) {
            tempArr[start2 + i] = arr[start2 + i]
        }

        var i = 0
        var j = 0
        var k = left
        while (i < size1 && j < size2) {
            if (tempArr[start1 + i] <= tempArr[start2 + j]) {
                arr[k] = tempArr[start1 + i]
                i += 1
            } else {
                arr[k] = tempArr[start2 + j]
                j += 1
            }
            k += 1
        }

        while (i < size1) {
            arr[k] = tempArr[start1 + i]
            i += 1
            k += 1
        }
        while (j < size2) {
            arr[k] = tempArr[start2 + j]
            j += 1
            k += 1
        }
    }
}
