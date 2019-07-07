import kotlin.math.max
import kotlin.math.min

class Solution121 {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var currentMinPrice = Int.MAX_VALUE
        for (price in prices) {
            maxProfit = max(price - currentMinPrice, maxProfit)
            currentMinPrice = min(currentMinPrice, price)
        }
        return maxProfit
    }
}