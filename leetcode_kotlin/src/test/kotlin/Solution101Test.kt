import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Solution101Test {

    @Test
    fun test1() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(3)
                right = TreeNode(4)
            }
            right = TreeNode(2).apply {
                left = TreeNode(4)
                right = TreeNode(3)
            }
        }
        assertTrue(Solution101().isSymmetric(root))
    }

    @Test
    fun test2() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(2)
            }
            right = TreeNode(2).apply {
                left = TreeNode(2)
            }
        }
        assertFalse(Solution101().isSymmetric(root))
    }
}