class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        mp=defaultdict(int)
        res=maxc=0

        for i in nums:
            mp[i]=1+mp.get(i,0)
            if maxc<mp[i]:
                res=i
                maxc=mp[i]
        return res
                
            