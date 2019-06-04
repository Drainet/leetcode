import main.kotlin.Solution283
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Solution283Tests {

    @Test
    fun test1() {
        val results = intArrayOf(0, 1, 0, 3, 12)
        Solution283().moveZeroes(results)
        assertTrue(results.contentEquals(intArrayOf(1, 3, 12, 0, 0)))
    }


}
