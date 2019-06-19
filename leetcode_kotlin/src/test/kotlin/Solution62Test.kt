import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Solution62Tests {

    @Test
    fun test1() {
        val result = Solution62().uniquePaths(3, 2)
        Assertions.assertEquals(3, result)
    }

    @Test
    fun test2() {
        val result = Solution62().uniquePaths(7, 3)
        Assertions.assertEquals(28, result)
    }
}
