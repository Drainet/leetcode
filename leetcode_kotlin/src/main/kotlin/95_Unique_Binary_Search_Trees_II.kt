package main.kotlin

class Solution95 {

    fun generateTrees(n: Int): List<TreeNode?> {
        val result = mutableListOf<TreeNode?>()
        val values = IntArray(n) { it + 1 }.toList()
        iterateSmallersAndGreaters(values) { value, smallers, greaters ->
            result.addAll(generateNodes(value, smallers, greaters))
        }
        return result
    }

    private fun generateNodes(value: Int, smallers: List<Int>, greaters: List<Int>): List<TreeNode?> {
        if (smallers.size <= 1 && greaters.size <= 1) {
            return listOf(
                TreeNode(value).apply {
                    left = smallers.firstOrNull()?.let(::TreeNode)
                    right = greaters.firstOrNull()?.let(::TreeNode)
                }
            )
        }

        val resultNodes = mutableListOf<TreeNode?>()

        val leftResults = mutableListOf<TreeNode?>()
        iterateSmallersAndGreaters(smallers) { v, s, g ->
            leftResults.addAll(generateNodes(v, s, g))
        }

        val rightResults = mutableListOf<TreeNode?>()
        iterateSmallersAndGreaters(greaters) { v, s, g ->
            rightResults.addAll(generateNodes(v, s, g))
        }

        if (greaters.isEmpty()) {
            resultNodes.addAll(leftResults.map { TreeNode(value).apply { left = it } })
        }
        if (smallers.isEmpty()) {
            resultNodes.addAll(rightResults.map { TreeNode(value).apply { right = it } })
        }
        for (smaller in leftResults) {
            for (greater in rightResults) {
                resultNodes.add(
                    TreeNode(value).apply {
                        left = smaller
                        right = greater
                    })
            }
        }
        return resultNodes
    }

    private fun iterateSmallersAndGreaters(
        target: List<Int>,
        iterator: (value: Int, smallers: List<Int>, greaters: List<Int>) -> Unit
    ) {
        for (i in 0 until target.count()) {
            val value = target[i]
            val smallers = target.subList(0, i)
            val greaters = target.subList(i + 1, target.count())
            iterator(value, smallers, greaters)
        }
    }
}