class Solution62 {
    private val resultMap = mutableMapOf<Pair<Int, Int>, Int>()
    fun uniquePaths(m: Int, n: Int): Int {
        if (m == 1 || n == 1) return 1
        val pair = if (m > n) Pair(m, n) else Pair(n, m)
        resultMap[pair]?.let { result ->
            return result
        }
        val result = uniquePaths(m - 1, n) + uniquePaths(m, n - 1)
        resultMap[pair] = result
        return result
    }
}