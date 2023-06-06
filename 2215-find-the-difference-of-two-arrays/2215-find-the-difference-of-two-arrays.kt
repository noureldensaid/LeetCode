class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()
        val ans1 = mutableListOf<Int>()
        val ans2 = mutableListOf<Int>()
        val set1 = mutableSetOf<Int>()
        val set2 = mutableSetOf<Int>()

        for (n in nums1) set1.add(n)
        for (n in nums2) set2.add(n)

        for (n in set1) {
            if (!set2.contains(n)) {
                ans1.add(n)
            }
        }

        for (n in set2) {
            if (!set1.contains(n)) {
                ans2.add(n)
            }
        }

        ans.add(ans1)
        ans.add(ans2)
        return ans
    }

}