class Solution {
    public int numDecodings(String s) {
        int n = s.length();

        if (n == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int prev2 = 1; // dp[0]
        int prev1 = 1; // dp[1]

        for (int i = 1; i < n; i++) {
            int curr = 0;

            // Single digit decode
            if (s.charAt(i) != '0') {
                curr += prev1;
            }

            // Two digit decode
            int num = (s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0');
            if (num >= 10 && num <= 26) {
                curr += prev2;
            }

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}