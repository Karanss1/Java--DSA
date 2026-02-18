// Solution: Iterate the string, for each character, 
// try to expand left and right to get the longest palindromic substring
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.trim().equals("")) {
            return s;
        }
        int len = s.length();
        int begin = 0;
        int maxLen = 0;
        for (int i = 0; i < len - maxLen / 2; i++) {
            int j = i;
            int k = i;
            while (k < len - 1 && s.charAt(k) == s.charAt(k + 1)) { 
                k++;
            }
            while (j > 0 && k < len - 1 && s.charAt(j-1) == s.charAt(k+1)) { // Expand both left and right
                j--;
                k++;
            }
            int newLen = k - j + 1;
            if (newLen > maxLen) {
                begin = j;
                maxLen = newLen;
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}