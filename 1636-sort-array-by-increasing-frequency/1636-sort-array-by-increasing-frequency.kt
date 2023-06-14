class Solution {
   fun frequencySort(nums: IntArray): IntArray {
    val frequencyMap = hashMapOf<Int, Int>()

    nums.forEach { item ->
        frequencyMap[item] = frequencyMap.getOrDefault(item, 0) + 1
    }

    return nums.sortedWith(
        compareBy(
            { frequencyMap[it] }, { -it }
        )
    ).toIntArray()


}

}