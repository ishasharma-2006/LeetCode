class Solution {
public:
    char findTheDifference(string s, string t) {
        string s1="";
        int Xor=0;
        s1+=s;
        s1+=t;
        for(int i=0;i<s1.length();i++){
            Xor^=s1[i];
        }
    return (char)Xor;
    }
};