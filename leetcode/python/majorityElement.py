

# leetcode.com majorityElement

class Solution:
    def majorityElement(self, num):
        d = {}
        size = len(num)

        for i in num:
            if i in d:
                d[i] += 1
            else:
                d[i] = 1

            if d[i] > size / 2:
                return i
