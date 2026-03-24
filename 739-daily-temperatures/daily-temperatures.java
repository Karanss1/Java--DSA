class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        int[] res = new int[n]; 
        Deque<Integer> mono = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!mono.isEmpty() && temperatures[mono.peek()] < temperatures[i]) {
                int idx = mono.pop();
                res[idx] = i - idx; // FIX: store days difference
            }
            mono.push(i); // FIX: always push
        }

        return res;
    }
}