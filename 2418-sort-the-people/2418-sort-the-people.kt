class Solution {
fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
    val hashmap = hashMapOf<Int, String>()
    val sortedHeights = heights.sortedDescending()
    for (i in names.indices) {
        hashmap.put(heights[i], names[i])
    }
    val result = mutableListOf<String>()
    for (item in sortedHeights) {
        result.add(hashmap.getOrDefault(item,"null"))
    }
    return result.toTypedArray()
}

}