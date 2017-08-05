
// leetcode.com  66. Plus One

class Solution
{
  public:
    vector<int> plusOne(vector<int> &digits)
    {
        if (digits.size() == 0)
            return digits;

        int carry = 1, sum = 0;

        for (int i = digits.size() - 1; i >= 0; --i)
        {
            if (carry == 0)
                return digits;

            sum = digits[i] + carry;
            carry = sum / 10;
            digits[i] = sum % 10;
        }

        if (carry)
            digits.insert(digits.begin(), carry);

        return digits;
    }
};