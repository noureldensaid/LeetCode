class Solution {
 fun frequencySort(nums: IntArray): IntArray {
    // Create a mutable map to store the frequency of each number
    val frequencyMap = mutableMapOf<Int, Int>().withDefault { 0 }

    // Count the frequency of each number in the input array
    for (num in nums) {
        frequencyMap[num] = frequencyMap.getValue(num) + 1
    }

    // Sort the numbers based on frequency (ascending) and value (descending)
    return nums.sortedWith(compareBy({ frequencyMap.getValue(it) }, { -it }))
        .toIntArray()
}

}