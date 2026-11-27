class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l, r = 0, len(nums) - 1

        while l <= r:
            m = (l + r) // 2

            if nums[m] == target:
                return m

            # Check left side (sorted)
            if nums[l] <= nums[m]:
                if target > nums[m] or target < nums[l]:
                    l = m + 1  # Search right side
                else:
                    r = m - 1  # Search left side

            # Check right side (sorted)
            else:
                if target < nums[m] or target > nums[r]:
                    r = m - 1  # Search left side
                else:
                    l = m + 1  # Search right side

        return -1