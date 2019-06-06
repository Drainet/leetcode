import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution287Tests {

    @Test
    fun test1() {
        val result = Solution287().findDuplicate(intArrayOf(1, 3, 4, 2, 2))
        assertEquals(2, result)
    }

    @Test
    fun test2() {
        val result = Solution287().findDuplicate(intArrayOf(3, 1, 3, 4, 2))
        assertEquals(3, result)
    }


}
