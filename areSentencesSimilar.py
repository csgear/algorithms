

# leetcode.com LeetCode 734. Sentence Similarity

import collections

class Solution(object):
    def areSentencesSimilar(self, words1, words2, pairs):
        """
        :type words1: List[str]
        :type words2: List[str]
        :type pairs: List[List[str]]
        :rtype: bool
        """
        if len(words1) != len(words2): return False

        similars = collections.defaultdict(set)

        for w1, w2 in pairs:
            similars[w1].add(w2)
            similars[w2].add(w1)

        for w1, w2 in zip(words1, words2):
            if w1 != w2 and w2 not in similars[w1]:
                return False
        return True

if __name__ == "__main__":
	words1 = ["great","acting","skills"]
	words2 = ["fine","drama","talent"]
	pairs = [["great","fine"],["drama","acting"],["skills","talent"]]
	sol = Solution()

	sol.areSentencesSimilar(words1, words2, pairs)