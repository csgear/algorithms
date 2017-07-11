
### leetcode.com  554. Brick Wall

import collections

class Solution(object):
    def leastBricks(self, wall):
        """
        :type wall: List[List[int]]
        :rtype: int
        """
        edges = collections.Counter()

        for bricks in wall:
            cnt = 0
            for b in bricks:
                if b:
                    edges[cnt] += 1
                cnt = cnt + b

        ### handle the case if edges is empty
        return len(wall) - max(edges.values() or [0])

