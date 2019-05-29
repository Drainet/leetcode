package main.kotlin

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution102 {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<MutableList<Int>>()
        if (root != null) {
            insertValues(result, root, 0)
        }
        return result
    }

    private fun insertValues(result: MutableList<MutableList<Int>>, node: TreeNode, level: Int) {
        if (result.size <= level) {
            result.add(mutableListOf(node.`val`))
        } else {
            result[level].add(node.`val`)
        }
        node.left?.let {
            insertValues(result, it, level + 1)
        }
        node.right?.let {
            insertValues(result, it, level + 1)
        }
    }
}