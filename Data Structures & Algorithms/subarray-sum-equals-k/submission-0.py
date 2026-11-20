class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        res,curs=0,0
        prefixSum={0:1}
        for n in nums:
            curs+=n
            diff = curs-k
            res+=prefixSum.get(diff,0)
            prefixSum[curs]=prefixSum.get(curs,0)+1
        return res 