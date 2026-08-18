class Solution {
public:
    string reversePrefix(string s, int k) {
        string t=s;
        reverse(t.begin(),t.end());
        if (k==s.size()) return t;
        if (k==0||k==1) return s;
        int p=k,l=0,r=p-1;
        while(l<r){
            swap(s[l],s[r]);
            l++;
            r--;
        }
    return s;
    }
};