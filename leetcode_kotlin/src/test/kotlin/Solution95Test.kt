import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

object Solution95Test {

    @Test
    fun test1() {
        val result = Solution95().generateTrees(1)
        val expect: List<TreeNode?> = listOf(TreeNode(1))
        assertEquals(expect, result)
    }

    @Test
    fun test2() {
        val result = Solution95().generateTrees(2)
        val expect: List<TreeNode?> =
            listOf(
                TreeNode(1).apply { right = TreeNode(2) },
                TreeNode(2).apply { left = TreeNode(1) }
            )
        assertEquals(expect, result)
    }

    @Test
    fun test3() {
        val result = Solution95().generateTrees(3)
        val expect: List<TreeNode?> =
            listOf(
                TreeNode(1).apply { right = TreeNode(2).apply { right = TreeNode(3) } },
                TreeNode(1).apply { right = TreeNode(3).apply { left = TreeNode(2) } },
                TreeNode(2).apply { left = TreeNode(1); right = TreeNode(3) },
                TreeNode(3).apply { left = TreeNode(1).apply { right = TreeNode(2) } },
                TreeNode(3).apply { left = TreeNode(2).apply { left = TreeNode(1) } }
            )
        assertEquals(expect, result)
    }
}
