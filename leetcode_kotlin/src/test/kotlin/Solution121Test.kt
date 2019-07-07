import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution121Test {

    @Test
    fun test1() {
        val result = Solution121().maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))
        assertEquals(5, result)
    }

    @Test
    fun test2() {
        val result = Solution121().maxProfit(intArrayOf(7, 6, 4, 3, 1))
        assertEquals(0, result)
    }

}