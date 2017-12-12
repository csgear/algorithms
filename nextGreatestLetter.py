
# leetcode.com 744. Find Smallest Letter Greater Than Target

class Solution:
    def nextGreatestLetter(self, letters, target):
        """
        :type letters: List[str]
        :type target: str
        :rtype: str
        """
        pos = bisect.bisect_right(letters, target)
        return letters[0] if pos == len(letters) else letters[pos]