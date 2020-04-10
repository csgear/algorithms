//
//  leetcode.com  336. Palindrome Pairs//  cprime
//


#include <iostream>
#include <vector>
#include <map>
#include <unordered_map>
#include <string>
#include <algorithm>

using namespace std ;

class Solution {
    
public:
    bool isPalindrome(string &str)
    {
        for(int i = 0 ; i < str.size() / 2 ; i++)
        {
            if(str[i] != str[str.size() - 1 - i]) return false ;
        }
        return true ;
    }
    
    vector<vector<int>> palindromePairs(vector<string>& words) {
        
        vector<vector<int>> result ;
        
        unordered_map<string, int>  trie ;
        
        for(int i = 0 ; i < words.size() ; i++)  trie.insert(make_pair(words[i], i)) ;
        
        for(int i = 0 ; i < words.size() ; i++)
        {
            std::reverse(words[i].begin(), words[i].end()) ;
            
            int len = words[i].size() ;
            
            for(int j = 0 ; j <= len ; j++)
            {
                string left = words[i].substr(0, j) ;
                
                string right = words[i].substr(j) ;
                
                // left substring  
                if(trie.find(left) != trie.end() && isPalindrome(right) && trie[left] != i && len >= j)
                    result.push_back(vector<int> {trie[left], i}) ;
                
                // right substring 
                if(isPalindrome(left) && trie.find(right) != trie.end() && trie[right] != j && len > len - j) 
                    result.push_back(vector<int>{i, trie[right]}) ;
            }
        }
        
        return result ;
    }
};
