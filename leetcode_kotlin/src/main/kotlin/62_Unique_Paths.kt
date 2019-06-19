class Solution62 {
    fun uniquePaths(m: Int, n: Int): Int {
        if (m == 1 || n == 1) return 1
        val resultRow = IntArray(n) { 1 }
        for (i in 1 until m) {
            for (j in 1 until n) {
                resultRow[j] =
                    if (j == 1) resultRow[j] + 1
                    else resultRow[j] + resultRow[j - 1]
            }
        }
        return resultRow.last()
    }
}