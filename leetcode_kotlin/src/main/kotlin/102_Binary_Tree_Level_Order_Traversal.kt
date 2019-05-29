package main.kotlin

class Solution102 {
    fun levelOrder(root: TreeNode?): List<List<Int>> =
        mutableListOf<MutableList<Int>>().apply {
            addNodeValuesByLevel(root, 0)
        }

    private fun MutableList<MutableList<Int>>.addNodeValuesByLevel(node: TreeNode?, level: Int) {
        if (node == null) return
        val currentLevelList = getOrNull(level) ?: mutableListOf<Int>().also { add(it) }
        currentLevelList.add(node.`val`)
        addNodeValuesByLevel(node.left, level + 1)
        addNodeValuesByLevel(node.right, level + 1)
    }
}