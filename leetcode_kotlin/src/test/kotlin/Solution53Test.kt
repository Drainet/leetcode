import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution53Test {

    @Test
    fun test1() {
        val result = Solution53().maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))
        assertEquals(6, result)
    }

    @Test
    fun testJava() {
        val result = Solution53J().maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))
        assertEquals(6, result)
    }
}
