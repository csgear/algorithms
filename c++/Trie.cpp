
// leetcode.com 208. Implement Trie (Prefix Tree)

#include <string>
#include <vector>

using namespace std ;

class TrieNode {
public:
    TrieNode *child[26] ;
    
    bool isWord ;
    
    TrieNode() : isWord(false)
    {
        for(auto& s : child )  s = nullptr ;
    }
    
};

class Trie {
    
private:
    TrieNode *root ;
    
public:
    /** Initialize your data structure here. */
    Trie() {
        root = new TrieNode() ;
    }
    
    /** Inserts a word into the trie. */
    void insert(string word) {
        TrieNode *p = root ;
        
        for(auto &c : word)
        {
            int i = c - 'a' ;
            
            if(! p->child[i])  p->child[i] = new TrieNode() ;
            
            p = p->child[i] ;
            
        }
        
        p->isWord = true ;
    }
    
    /** Returns if the word is in the trie. */
    bool search(string word) {
        TrieNode *p = root ;
        
        for(auto& c : word)
        {
            int i = c - 'a' ;
            
            if( ! p->child[i])  return false ;
            
            p = p->child[i] ;
        }
        
        return p->isWord ;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    bool startsWith(string prefix) {
        TrieNode *p = root ;
        
        for(auto& c : prefix)
        {
            int i = c - 'a' ;
            
            if( ! p->child[i])  return false ;
            
            p = p->child[i] ;
        }
        
        return true ;
        
    }
};

