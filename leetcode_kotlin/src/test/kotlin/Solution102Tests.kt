import main.kotlin.Solution102
import main.kotlin.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution102Tests {

    @Test
    fun test1() {
        val node = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }
        val result = Solution102().levelOrder(node)
        assertEquals(listOf(listOf(3), listOf(9, 20), listOf(15, 7)), result)
    }
}
