class Solution121 {
    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty()) {
            return 0
        }
        var maxProfit = 0
        var currentMinPrice = prices.first()
        for (i in 0 until prices.size) {
            val currentPrice = prices[i]
            val profit = currentPrice - currentMinPrice
            if (profit > maxProfit) {
                maxProfit = profit
            }
            if (currentPrice < currentMinPrice) {
                currentMinPrice = currentPrice
            }
        }
        return maxProfit
    }
}