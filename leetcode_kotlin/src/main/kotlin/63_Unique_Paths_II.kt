class Solution63 {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        val resultRow = IntArray(obstacleGrid.size) { 0 }
        resultRow[obstacleGrid.size - 1] = 1
        for (i in obstacleGrid[0].size - 1 downTo 0) {
            for (j in obstacleGrid.size - 1 downTo 0) {
                resultRow[j] = when (obstacleGrid[j][i]) {
                    1 -> 0
                    0 -> resultRow[j] + resultRow.getOrElse(j + 1) { 0 }
                    else -> error("must be 0 or 1")
                }
            }
        }
        return resultRow.first()
    }
}