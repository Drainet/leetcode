class Solution39 {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> =
        mutableListOf<List<Int>>().apply {
            backtrackCombinationSum(candidates.sorted(), target, listOf())
        }

    private fun MutableList<List<Int>>.backtrackCombinationSum(sorted: List<Int>, target: Int, currentList: List<Int>) {
        loop@ for ((i, num) in sorted.withIndex()) {
            when (num) {
                target -> add(currentList + num)

                in 0..target -> backtrackCombinationSum(
                    sorted = sorted.subList(i, sorted.size),
                    target = target - num,
                    currentList = currentList + num
                )

                else -> break@loop
            }
        }
    }

}