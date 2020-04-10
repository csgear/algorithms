
# leetcode.com 492. Construct the Rectangle


class Solution(object):
    def constructRectangle(self, area):
        """
        :type area: int
        :rtype: List[int]
        """
        root = int(math.sqrt(area))

        L, W = area, 1

        for x in range(root, 0, -1):
            if area % x == 0:
                L, W = int(area / x), x
                break
        return [L, W]
