import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution43Test {
    @Test
    fun test1() {
        val result = Solution43().multiply("2", "3")
        assertEquals("6", result)
    }

    @Test
    fun test2() {
        val result = Solution43().multiply("123", "456")
        assertEquals("56088", result)
    }
}