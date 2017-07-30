
// leetcode.com 20. Valid Parentheses

#include <stack>

using namespace std;

class Solution
{
  public:
    // using a stack the pair the {} [] ()
    bool isValid(string s)
    {
        stack<char> p;

        for (auto c : s)
        {
            if (c == '(' || c == '{' || c == '[')
                p.push(c);

            else
            {
                if (p.empty())
                    return false;

                if (c == ')' && p.top() != '(')
                    return false;

                if (c == '}' && p.top() != '{')
                    return false;

                if (c == ']' && p.top() != '[')
                    return false;

                p.pop();
            }
        }

        return p.empty();
    }
};