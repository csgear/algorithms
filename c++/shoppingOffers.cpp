//
//  leetcode.com  638. Shopping Offers

#include <vector>
#include <string>
#include <numeric>
#include <functional>
#include <map>
#include <tuple>
#include <iostream>

using namespace std ;


// dp[needs]初始化为sum(prices * needs)
//
// dp[needs] = min(dp[needs], dp[needs - special[:-1]] + special[-1])

class Solution {
    
private:
    map<vector<int>, int> dp ;
    
public:
    int shoppingOffers(vector<int>& price, vector<vector<int>>& special, vector<int>& needs) {
        
        auto iter = dp.find(needs) ;
        
        if(iter != dp.end())  return dp[needs] ;
        
        int product = inner_product(price.begin(), price.end(), needs.begin(), 0) ;
        
        dp.insert(iter, make_pair(needs, product)) ;
        
        for(auto offer : special)
        {
            
            // if needs >= offer then take offer, else continue
            
            vector<int> take(needs.size()) ;
            
            std::transform(needs.begin(), needs.end(), offer.begin(), take.begin(),
                           std::minus<int>()) ;
            
            if(any_of(take.begin(), take.end(), [](int i){
                return i < 0 ;
            })) continue ;
            
            int special_price = offer[offer.size() - 1] ;
            
            dp[needs] = min(dp[needs], shoppingOffers(price, special, take) + special_price) ;
        }
        
        return dp[needs] ;
    }
    
    
    void test_offer()
    {
        vector<int> price = {2,3,4} ;
        vector<vector<int>> special = { {1,1,0,4}, {2,2,1,9}} ;
        vector<int> needs = {1,2,1} ;
        
        int result = shoppingOffers(price, special, needs) ;
        
        cout << result << endl ;
        
    }
    
};
