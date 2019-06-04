import main.kotlin.Solution96
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution96Tests {

    @Test
    fun test1and2() {
        val result1 = Solution96().numTrees(1)
        assertEquals(1, result1)
        val result2 = Solution96().numTrees(2)
        assertEquals(2, result2)
    }

    @Test
    fun test3() {
        val result = Solution96().numTrees(3)
        assertEquals(5, result)
    }
}