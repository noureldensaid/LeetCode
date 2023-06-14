class Solution {
 fun frequencySort(nums: IntArray): IntArray {
    val frequencyMap = mutableMapOf<Int, Int>().withDefault { 0 }

    for (num in nums) {
        frequencyMap[num] = frequencyMap.getValue(num) + 1
    }

    // negative sign to sort in descinding order
    return nums.sortedWith(compareBy({ frequencyMap.getValue(it) }, { -it}))
         .toIntArray()
}

}