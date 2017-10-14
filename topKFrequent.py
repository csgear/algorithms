
# leetcode.com  347. Top K Frequent Words

class Solution:
	def topKFrequent(self, nums, k):
	    bucket = [[] for _ in nums]
	    for num, freq in collections.Counter(nums).items():
	        bucket[-freq].append(num)
	    return list(itertools.chain(*bucket))[:k]