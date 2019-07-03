import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Solution49Test {

    @Test
    fun test1() {
        val result = Solution49().groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
        val resultArray = result.map { it.toTypedArray() }.toTypedArray()
        assertTrue(
            arrayOf(
                arrayOf("eat", "tea", "ate"),
                arrayOf("tan", "nat"),
                arrayOf("bat")
            ).contentDeepEquals(resultArray)
        )
    }
}