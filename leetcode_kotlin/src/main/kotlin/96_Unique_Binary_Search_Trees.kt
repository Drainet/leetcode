package main.kotlin

/**
 * Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1 ... n.
 * */

class Solution96 {

    private val numTreesMap = mutableMapOf<Int, Int>()

    fun numTrees(n: Int): Int {
        numTreesMap[n]?.also {
            return it
        }
        if (n <= 2) return n
        val remainNodes = n - 1
        val onlyLeftOrRight = 2 * numTrees(remainNodes)
        var leftAndRight = 0
        for (i in 1 until remainNodes){
            leftAndRight += numTrees(i) * numTrees(remainNodes - i)
        }
        val result = onlyLeftOrRight + leftAndRight
        numTreesMap[n] = result
        return result
    }
}