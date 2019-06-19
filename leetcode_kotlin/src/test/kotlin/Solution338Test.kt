import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Solution338Test {

    @Test
    fun test1() {
        val result = Solution338().countBits(2)
        assertTrue(intArrayOf(0, 1, 1).contentEquals(result))
    }

    @Test
    fun test2() {
        val result = Solution338().countBits(5)
        assertTrue(intArrayOf(0, 1, 1, 2, 1, 2).contentEquals(result))
    }
}
