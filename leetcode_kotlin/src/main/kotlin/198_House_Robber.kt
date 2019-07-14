import kotlin.math.max

class Solution198 {
    fun rob(nums: IntArray): Int {
        if (nums.size <= 3) {
            return max(nums.getOrElse(nums.size - 2) { 0 },
                nums.getOrElse(nums.size - 1) { 0 } +
                        nums.getOrElse(nums.size - 3) { 0 }
            )
        }
        var prev1Max = max(nums[nums.size - 2], nums[nums.size - 1] + nums[nums.size - 3])
        var prev2Max = nums[nums.size - 2]
        var prev3Max = nums[nums.size - 1]
        for (i in nums.size - 4 downTo 0) {
            val num = nums[i]
            val currentMax = max(max(num + prev2Max, prev1Max), num + prev3Max)
            prev3Max = prev2Max
            prev2Max = prev1Max
            prev1Max = currentMax
        }
        return max(prev1Max, prev2Max)
    }
}