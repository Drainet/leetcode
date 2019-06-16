class Solution338 {
    fun countBits(num: Int): IntArray {
        if (num == 0) return intArrayOf(0)
        if (num == 1) return intArrayOf(0, 1)
        val result = IntArray(num + 1)
        result[0] = 0
        result[1] = 1
        var currentBase = 2
        for (i in 2..num) {
            var index = i - currentBase
            if (index == currentBase) {
                currentBase *= 2
                index = i - currentBase
            }
            result[i] = result[index] + 1
        }
        return result
    }
}