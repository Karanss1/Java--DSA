class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Deque<Integer> mono = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < 2 * n; i++) {
            while (!mono.isEmpty() && nums[mono.peek()] < nums[i % n]) {
                res[mono.pop()] = nums[i % n];
            }
            if (i < n)
                mono.push(i);
        }

        return res;
    }
}