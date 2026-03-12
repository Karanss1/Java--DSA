class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        
        
        nums.sort()
        ans = []

        def backtrack(c, r):
            if len(r) == 0:
                ans.append(c[:])
                return

            for i in range(len(r)):
                if i > 0 and r[i] == r[i-1]:
                    continue

                c.append(r[i])
                backtrack(c, r[:i] + r[i+1:])
                c.pop()

        backtrack([], nums)
        return ans