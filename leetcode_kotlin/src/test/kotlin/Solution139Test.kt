import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Solution139Test {
    @Test
    fun test1() {
        assertTrue(Solution139().wordBreak("leetcode", listOf("leet", "code")))
    }

    @Test
    fun test2() {
        assertTrue(Solution139().wordBreak("applepenapple", listOf("apple", "pen")))
    }

    @Test
    fun test3() {
        assertFalse(Solution139().wordBreak("catsandog", listOf("cats", "dog", "sand", "and")))
    }
}