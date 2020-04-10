// leetcode.com 204. Count Primes

#include <vector>
#include <cmath>

using namespace std;

class Solution
{
  public:
    int countPrimes(int n)
    {
        vector<bool> s(n, true);

        int upper = sqrt(n);

        for (int i = 2; i <= upper; i++)
        {
            if (s[i])
            {
                for (int j = i * i; j < n; j += i)
                    s[j] = false;
            }
        }

        int res = 0;

        for (int j = 2; j < n; j++)
            if (s[j])
                res++;

        return res;
    }
};