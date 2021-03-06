class MagicDictionary:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.dmap = collections.defaultdict(set)
        

    def buildDict(self, dict):
        """
        Build a dictionary through a list of words
        :type dict: List[str]
        :rtype: void
        """
        for word in dict:
            for x in range(len(word)):
                key = word[:x] + "_" + word[x+1:]
                self.dmap[key].add(word[x])
        

    def search(self, word):
        """
        Returns if there is any word in the trie that equals to the given word after modifying exactly one character
        :type word: str
        :rtype: bool
        """
        for x in range(len(word)):
            key = word[:x] + "_" + word[x+1:]
            values = self.dmap[key]
            if not values:
                continue
            if word[x] not in values or len(values) > 1:
                return True
            
        return False 
        


# Your MagicDictionary object will be instantiated and called as such:
# obj = MagicDictionary()
# obj.buildDict(dict)
# param_2 = obj.search(word)
