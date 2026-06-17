class Solution {
    public int getSum(int a, int b) {
        int res;
        while(b != 0){
            res = (a&b);
            a = a^b;
            b = (res) << 1;

        }

        return a;
    }
}