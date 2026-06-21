class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int height = triangle.size();
        int[] dp = new int[height + 1];

        for (int level = height - 1; level >= 0; level--) {

            for (int i = 0; i <= level; i++) {

                dp[i] = triangle.get(level).get(i)
                        + Math.min(dp[i], dp[i + 1]);
            }
        }

        return dp[0];
    }
}