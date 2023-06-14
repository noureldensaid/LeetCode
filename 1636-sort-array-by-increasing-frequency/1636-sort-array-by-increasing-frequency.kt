class Solution {
fun frequencySort(nums: IntArray): IntArray {
    val frequencyMap = mutableMapOf<Int, Int>().withDefault { 0 }

    for (num in nums) {
        frequencyMap[num] = frequencyMap.getValue(num) + 1
    }

    return nums.sortedWith(
        compareBy<Int> { frequencyMap.getValue(it) }
            .thenByDescending { it }
    ).toIntArray()
}


}