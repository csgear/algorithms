

// leetcode.com 692. Top K Frequent Words

#include <unordered_map>
#include <vector>
#include <queue>
#include <string>

using namespace std ;

class Solution {
public:
    vector<string> topKFrequent(vector<string>& words, int k) {
    	unordered_map<string, int> map ;

    	for(string s : words)
    	{
    		map[s]++ ;
    	} 

    	vector<string> res;

    	priority_queue<pair<string, int>> pq ;

    	for(auto it = pq.begin() ; it != pq.end() ; it++)
    	{
    		pq.push(make_pair(it->second, it->first)) ;

    		if(pq.size() > int(map().size - k))
    		{
    			res.push_back(pq.top().second) ;
    			pq.pop() ;
    		}
    	}

    	return res ;
    }
};