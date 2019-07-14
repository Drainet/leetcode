import kotlin.math.max

class Solution198 {
    fun rob(nums: IntArray): Int {
        if (nums.size <= 2) {
            return nums.max() ?: 0
        }
        var prev2 = nums[nums.size - 1]
        var prev1 = max(nums[nums.size - 2], prev2)
        for (i in nums.size - 3 downTo 0) {
            val num = nums[i]
            val currentMax = max(num + prev2, prev1)
            prev2 = prev1
            prev1 = currentMax
        }
        return max(prev1, prev2)
    }
}