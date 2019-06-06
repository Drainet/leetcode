class Solution283 {
    fun moveZeroes(nums: IntArray) {
        var zeroStartIndex = 0
        for (i in 0 until nums.size) {
            val num = nums[i]
            if (num != 0) {
                if (i != zeroStartIndex) {
                    nums[zeroStartIndex] = num
                    nums[i] = 0
                }
                zeroStartIndex++
            }
        }
    }
}