//leetcode.com 211. Add and Search Word - Data structure design

#include <string>
using namespace std ;

class WordDictionary {
public:
    class TrieNode
    {
    public:
        TrieNode *child[26] ;
        
        bool isWord ;
        
        TrieNode() : isWord(false)
        {
            for(auto& s : child )  s = nullptr ;
        }
    } ;
    
private:
    TrieNode *root ;
    
public:
    /** Initialize your data structure here. */
    WordDictionary() {
        root = new TrieNode() ;
    }
    
    /** Adds a word into the data structure. */
    void addWord(string word) {
        TrieNode *p = root ;
        
        for(auto &c : word)
        {
            int i = c - 'a' ;
            
            if(! p->child[i])  p->child[i] = new TrieNode() ;
            
            p = p->child[i] ;
            
        }
        
        p->isWord = true ;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    bool search(string word) {
        return searchWord(word, root, 0) ;
    }
    
private:
    bool searchWord(string word, TrieNode *p, int k) {
        
        if(k == word.size()) return p->isWord ;
        
        if(word[k] == '.')
        {
            for(auto& child : p->child)
            {
                if(child != nullptr && searchWord(word, child, k + 1))
                    return true ;
            }
        }
        else
        {
            if(p->child[word[k] - 'a'] != nullptr && searchWord(word, p->child[word[k] - 'a'], k+1))
                return true ;
        }
        
        return false ;
    }
} ;
