
// leetcode.com 692. Top K Frequent Words

class Solution {
public:
    vector<string> topKFrequent(vector<string>& words, int k) {
        unordered_map<string, int> m ;
        
        for(auto w : words)
        {
            m[w]++ ;
        }
        
        vector<string> res ;
        
        auto compartor = [] (const pair<int, string>& a, const pair<int, string>& b)
        {
            if(a.first != b.first) return a.first < b.first ;
            else
            {
                if(a.second.compare(b.second) > 0) return true ;
            }
            return false ;
        } ;
        
        multimap<pair<int, string>, string, decltype(compartor)> mm(compartor) ;
        
        auto iter = m.begin() ;
        
        for(int i = 0 ; i < k ; i++)
        {
            mm.insert({make_pair(iter->second, iter->first), iter->first}) ;
            iter++ ;
        }
        
        for(int i = k ; i < m.size() ; i++)
        {
            mm.insert({make_pair(iter->second, iter->first), iter->first}) ;
            mm.erase(mm.begin()) ;
            iter++ ;
        }
        
        for(auto it = mm.rbegin() ; it != mm.rend() ; it++)
        {
            res.push_back(it->second) ;
        }
        
        return res ;
    }
};
