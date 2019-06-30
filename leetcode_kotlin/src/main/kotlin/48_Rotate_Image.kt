class Solution48 {
    fun rotate(matrix: Array<IntArray>): Unit {
        val size = matrix.size
        for (i in 0 until (size / 2)) {
            val currentSize = size - 2 * i
            for (j in i until size - i - 1) {
                rotateSquare(matrix, i, j - i, currentSize)
            }
        }
    }

    private fun rotateSquare(matrix: Array<IntArray>, start: Int, offset: Int, size: Int) {
        val second = matrix[start + offset][start + size - 1]
        matrix[start + offset][start + size - 1] = matrix[start][start + offset]

        val third = matrix[start + size - 1][size - 1 + start - offset]
        matrix[start + size - 1][size - 1 + start - offset] = second

        val fourth = matrix[size - 1 + start - offset][start]
        matrix[size - 1 + start - offset][start] = third

        matrix[start][start + offset] = fourth
    }
}
