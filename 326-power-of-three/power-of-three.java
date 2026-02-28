class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;

        while (n % 3 == 0) {
            n = (n+1) / 3;
        }

        return n == 1;
    }
}