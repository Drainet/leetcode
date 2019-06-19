class Solution53 {
    fun maxSubArray(nums: IntArray): Int {
        var max = Int.MIN_VALUE
        var currentSum = Int.MIN_VALUE
        for (num in nums) {
            currentSum = if (currentSum < 0) num else currentSum + num
            if (currentSum > max) {
                max = currentSum
            }
        }
        return max
    }
}