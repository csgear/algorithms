
# leetcode.com 88. Merge Sorted Array


class Solution:
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: void Do not return anything, modify nums1 in-place instead.
        """
        index = m + n - 1
        m = m - 1
        n = n - 1
        while m >= 0 and n >= 0:
            if(nums1[m] > nums2[n]):
                nums1[index] = nums1[m]
                m = m - 1
            else:
                nums1[index] = nums2[n]
                n = n - 1
            index = index - 1

        if m < 0:
            nums1[:n + 1] = nums2[:n + 1]