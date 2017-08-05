

class Solution {
public:
    string addBinary(string a, string b) {
        int m = a.size() - 1, n = b.size() - 1 ;
        
        string s ;
        int carry = 0 ;
        
        while(m >= 0 || n >= 0)
        {
            int p = (m >= 0 ? a[m--] - '0' : 0) ;
            int q = (n >= 0 ? b[n--] - '0' : 0) ;
            int sum = p + q + carry ;
            s = to_string(sum % 2) + s ;
            carry = sum / 2 ;
        }

        return (carry == 1) ? to_string(carry) + s : s ;
    }
};