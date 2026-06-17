class Solution {
    public int hammingWeight(int n) {
       int count = 0;
        while (n!=0) {
            n &= (n - 1);  // drop the lowest set bit
            // Brian Kernighan’s Algorithm it reduces bit one by one till end 
            // like n = 50, n-1 = 49 , n=&(n-1) = 48 till end 
            count++;
        }
        return count;  
    }
}