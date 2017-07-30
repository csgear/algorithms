
//  LeetCode: 386. Lexicographical Numbers

#include <vector>
#include <iostream>

using namespace std;

class Solution
{
  public:
    vector<int> lexicalOrder(int n)
    {
        vector<int> result{};

        for (int i = 1; i < 10; i++)
        {
            if (i > n)
                break;

            result.push_back(i);

            generateNumbers(i, n, result);
        }

        return result;
    }

    void generateNumbers(int first, int n, vector<int> &v)
    {
        int t;

        for (int i = 0; i < 10; i++)
        {
            t = first * 10 + i;
            if (t > n)
                break;

            v.push_back(t);

            generateNumbers(t, n, v);
        }
    }
};

