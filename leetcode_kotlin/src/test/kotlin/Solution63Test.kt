import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution63Test {
    @Test
    fun test1() {
        val result = Solution63().uniquePathsWithObstacles(
            arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 1, 0),
                intArrayOf(0, 0, 0)
            )
        )
        assertEquals(2, result)
    }


}