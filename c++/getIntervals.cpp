
//  Leetcode.com:  352. Data Stream as Disjoint Intervals

#include <vector>

using namespace std ;

struct Interval {
    int start;
    int end;
    Interval() : start(0), end(0) {}
    Interval(int s, int e) : start(s), end(e) {}
} ;
 

class SummaryRanges {
public:
    /** Initialize your data structure here. */
    
    vector<Interval> v ;
    
    SummaryRanges() {
        
    }
    
    void addNum(int val) {
        Interval current(val, val) ;
        
        vector<Interval> res ;
        
        int pos = 0 ;
        
        
        for(auto range : res)
        {
            if ( (current.end + 1)  < range.start)
            {
                res.push_back(range) ;
            }
            else if ( (current.end + 1)  < range.start )
            {
                res.push_back(range) ;
                pos += 1 ;
            }
//            else if ( (current.start - 1 ) == range.end)
//            {
//                current.start = range.start ;
//            }
//            else if ( ( current.end  + 1 ) == range.start)
//            {
//                current.end = range.end ;
//            }
            else
            {
                current.start = min(current.start, range.start) ;
                current.end = max(current.end, range.end) ;
            }
        }
        
        res.insert(res.begin() + pos, current) ;
        v = res ;
    }
    
    vector<Interval> getIntervals() {
        return v ;
    }
};

