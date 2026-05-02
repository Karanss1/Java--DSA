class Solution {
    public int maxSubarraySumCircular(int[] nums) {
   
        int n = nums.length;
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int maxSum = nums[0];
        int minSum = nums[0];
        int sum = nums[0];
        
        for(int i=1;i<n;i++){
            sum += nums[i];
            maxEnding = Math.max(maxEnding + nums[i], nums[i]);
            maxSum = Math.max(maxSum, maxEnding);

            minEnding = Math.min(minEnding + nums[i], nums[i]);
            minSum = Math.min(minSum, minEnding);
        }
        if(maxSum < 0) return maxSum;
        return Math.max(maxSum, sum - minSum);
  }
}