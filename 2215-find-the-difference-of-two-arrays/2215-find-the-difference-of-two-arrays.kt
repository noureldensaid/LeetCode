class Solution {
 fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    val ans: MutableList<MutableList<Int>> = ArrayList()
    val ans1: MutableList<Int> = ArrayList()
    val ans2: MutableList<Int> = ArrayList()
    val set1: MutableSet<Int> = HashSet()
    val set2: MutableSet<Int> = HashSet()

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