
// letcoode.com 609. Find Duplicate File in System

#include <iostream>
#include <vector>
#include <string>
#include <unordered_map>
#include <sstream>

class Solution {
public:
    vector<vector<string>> findDuplicate(vector<string>& paths) {
        unordered_map<string, vector<string>> m ;
        vector<vector<string>> res ;

        for(auto& path: paths)
        {
            // split path with " " [whitespace]
            istringstream is(path) ;
            string pre = "", t = "" ;
            is >> pre ;
            while(is >> t)
            {
                int idx = t.find_last_of('(') ;
                string dir = pre + "/" + t.substr(0, idx) ;

                // [idx] (file content) [size]
                string content = t.substr(idx + 1, t.size() - idx - 2) ; 
                m[content].push_back(dir) ;
            }
        } 
        for(auto & a : m)
        {
            // have duplicats
            if(a.second.size() > 1)  res.push_back(a.second) ;
        } 

        return res ;
    }
};