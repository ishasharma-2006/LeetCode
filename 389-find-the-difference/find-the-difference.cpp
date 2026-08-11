class Solution {
public:
    char findTheDifference(string s, string t) {
        unordered_map<char,int> hm;
        for (auto i: s){
            hm[i]++;
        }
        for(auto i: t){
            hm[i]--;
        
        if(hm[i]<0) return i;
        }
    return '\0';
    }
};