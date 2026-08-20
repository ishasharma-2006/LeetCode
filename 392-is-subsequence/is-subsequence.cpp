class Solution {
public:
    bool isSubsequence(string s, string t) {
        if(s.empty()) return true;
        if(t.empty()) return false;
        int i=0,j=0;
        while(i<s.size() && j<t.size()){
            if(s[i]==t[j]){
                i++;
                j++;
            }
            else if(s[i]!=t[j]){
                j++;
            }
        if(i==s.size())
        return true;
        }
    return false;
    }
};