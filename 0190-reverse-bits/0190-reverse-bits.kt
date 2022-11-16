class Solution {
    // you need treat n as an unsigned value
  fun reverseBits(n: Int): Int {
    var ans = 0
    for (i in 0..31)  ans = (ans shl 1) or ((n ushr i) and 1)
    return ans
}

}