
# leetcode.com 692. Top K Frequent Words

class Solution(object):
    def topKFrequent(self, words, k):
        """
        :type words: List[str]
        :type k: int
        :rtype: List[str]
        """

        from collections import Counter
        from functools import cmp_to_key

        counter = Counter(words)
        freqs = {}

        for word, count in counter.items():
            if count not in freqs:
                freqs[count] = []
            freqs[count].append(word) 

        res = []

        for i in range(len(words), 0, -1):
            if i in freqs:
                for word in freqs[i]:
                    res.append((word, i))
            if(len(res) >= k):
                break 

        x = lambda a, b: (b[1] - a[1]) if (a[1] != b[1]) else (-1 if a[0] < b[0] else 1) 

        # for python 3.0, sort function takes key parameters
        res.sort(key = cmp_to_key(x))

        return [r[0] for r in res[0:k]]


if __name__ == "__main__":
    words = ["i", "love", "leetcode", "i", "love", "coding"]
    s = Solution()
    res = s.topKFrequent(words, 3)
    print(res)
