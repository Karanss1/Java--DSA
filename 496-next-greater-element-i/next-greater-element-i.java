class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> next = new HashMap<>();
        Deque<Integer> mono = new ArrayDeque<>();

        for (int x : nums2) {
            while (!mono.isEmpty() && mono.peek() < x) {
                next.put(mono.pop(), x);
            }
            mono.push(x);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = next.getOrDefault(nums1[i], -1);
        }

        return res;
    }
}