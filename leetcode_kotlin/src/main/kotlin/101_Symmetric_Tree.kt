class Solution101 {
    fun isSymmetric(root: TreeNode?): Boolean {
        return collect(root?.left, true, 1) ==
                collect(root?.right, false, 1)
    }

    private fun collect(root: TreeNode?, leftFirst: Boolean, level: Int): List<Pair<Int, Int?>> {
        return when {
            root == null -> listOf(Pair(level, null))
            leftFirst -> collect(root.left, true, level + 1) +
                    listOf(Pair(level, root.`val`)) +
                    collect(root.right, true, level + 1)
            else -> collect(root.right, false, level + 1) +
                    listOf(Pair(level, root.`val`)) +
                    collect(root.left, false, level + 1)
        }
    }
}