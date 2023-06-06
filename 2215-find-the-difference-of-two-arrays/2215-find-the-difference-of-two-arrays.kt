class Solution {
  fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
      
 val distinct1 = nums1.toSet() - nums2.toSet()
    val distinct2 = nums2.toSet() - nums1.toSet()
    return listOf(distinct1.toList(), distinct2.toList())
  }
}