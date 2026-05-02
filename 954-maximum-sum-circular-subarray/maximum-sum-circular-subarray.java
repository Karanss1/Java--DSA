class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int curMax = 0,  curMin = 0;
        int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;

        for (int x : nums) {
            curMax = Math.max(x, curMax + x);
            maxSum = Math.max(maxSum, curMax);

            curMin = Math.min(x, curMin + x);
            minSum = Math.min(minSum, curMin);

            total += x;
        }

        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
}