class Solution {
 fun frequencySort(nums: IntArray): IntArray {
    val frequencyMap = hashMapOf<Int, Int>().withDefault { 0 }

    for (num in nums) {
        frequencyMap[num] = frequencyMap.getValue(num) + 1
    }

    return nums.sortedWith(compareBy({ frequencyMap.getValue(it) }, { -it })).toIntArray()
}

}