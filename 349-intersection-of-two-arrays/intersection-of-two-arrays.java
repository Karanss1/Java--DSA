class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int n : nums1) {
            s1.add(n);
        }

        for (int m : nums2) {
            s2.add(m);
        }

        s1.retainAll(s2);

        int[] answer = new int[s1.size()];
        int i = 0;

        for (int x : s1) {
            answer[i++] = x;
        }
        return answer;
    }
}