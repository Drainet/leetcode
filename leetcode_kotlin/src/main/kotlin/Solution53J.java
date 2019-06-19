public class Solution53J {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currentSum = Integer.MIN_VALUE;
        for (int num : nums) {
            currentSum = (currentSum < 0) ? num : currentSum + num;
            if (currentSum > max) {
                max = currentSum;
            }
        }
        return max;
    }
}
