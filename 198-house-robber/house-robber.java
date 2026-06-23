class Solution {
    public int rob(int[] nums) {
    
    int priv2 = 0;
    int priv1 = 0;

    for(int num : nums){
        int curr = Math.max(priv1, priv2 + num);

        priv2 = priv1;
        
        priv1 = curr;
    }

    return priv1;

    }
}