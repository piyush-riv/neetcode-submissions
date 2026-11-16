class Solution:
    def sortColors(self, nums: List[int]) -> None:
        l = []

        for i in range(len(nums)):
            if nums[i] == 0:
                l.append(0)

        for i in range(len(nums)):
            if nums[i] == 1:
                l.append(1)

        for i in range(len(nums)):
            if nums[i] == 2:
                l.append(2)

        nums[:] = l