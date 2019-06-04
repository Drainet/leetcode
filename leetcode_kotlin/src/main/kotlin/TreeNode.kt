package main.kotlin

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    override fun equals(other: Any?): Boolean {
        val otherNode = other as? TreeNode ?: return false
        if (otherNode.`val` == `val`) {
            return left == otherNode.left && right == otherNode.right
        }
        return false
    }

    override fun hashCode(): Int {
        var result = `val`
        result = 31 * result + left?.`val`.hashCode()
        result = 31 * result + right?.`val`.hashCode()
        return result
    }

    override fun toString(): String {
        return "TreeNode($`val`) { left = ${left.toString()} right = ${right.toString() }} \n"
    }
}