class Solution {
  fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
    val hashmap = hashMapOf<Int, String>()
    for (i in names.indices) hashmap.put(heights[i], names[i])
    val sortedHeights = heights.sortedDescending()
    val result = Array<String>(names.size) { "null" }
    for (i in sortedHeights.indices) result[i] = hashmap.get(sortedHeights[i])!!
    return result
}
}