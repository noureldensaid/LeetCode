class Solution {
  fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    var min = Int.MAX_VALUE
    for (i in prices.indices) {
        if (prices[i] < min) min = prices[i]
        else if (prices[i] - min > maxProfit) maxProfit = prices[i] -min
    }
    return maxProfit
}

}