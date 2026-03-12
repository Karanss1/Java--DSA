class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        ans=[]
        def backtrack(c,r):
            if len(r)==0:
                ans.append(c[:])
                return
            for i in range(len(r)):
                c.append(r[i])
                backtrack(c,r[:i]+r[i+1:])
                c.pop()

        backtrack([],nums)
        return ans