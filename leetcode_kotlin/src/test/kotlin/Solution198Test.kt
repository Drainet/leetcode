import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution198Test {
    @Test
    fun test1() {
        val result = Solution198().rob(intArrayOf(1, 2, 3, 1))
        assertEquals(4, result)
    }

    @Test
    fun test2() {
        val result = Solution198().rob(intArrayOf(2, 7, 9, 3, 1))
        assertEquals(12, result)
    }

    @Test
    fun test3() {
        val result = Solution198().rob(intArrayOf(2, 1, 1, 2))
        assertEquals(4, result)
    }
}