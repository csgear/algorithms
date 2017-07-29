
//  Leetcode.com  : 482. License Key Formatting

#include <string>
#include <cctype>
#include <algorithm>
#include <iostream>

using namespace std;

class Solution
{
  public:
    string licenseKeyFormatting(string S, int K)
    {
        string res = "";

        for (auto &c : S)
        {
            if (c != '-')
                res += toupper(c);
        }

        if (res.size() % K)
        {
            res = string("#", (K - res.size() % K)) + res;
        }

        string s1 = "";

        for (int i = 0; i < res.size(); i++)
        {
            if (i % K == 0 && i != 0)
            {
                s1 += '-';
            }

            if (res[i] != '#')
                s1 += res[i];
        }

        return s1;
    }
};

//int main()
//{
//    Solution sol ;
//
//    string S = "2-4A0r7-4k" ;
//
//    int K = 3 ;
//
//    string ret = sol.licenseKeyFormatting(S, K) ;
//
//    cout << "ret = " << ret << endl ;
//
//    return 0 ;
//}
