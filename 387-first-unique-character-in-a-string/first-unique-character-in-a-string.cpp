class Solution {
public:
    int firstUniqChar(string s) {
        unordered_map<char,int> hm;
        for(int x: s){
            hm[x]++;
        }
        for(int i=0;i<s.size();i++){
            if(hm[s[i]]==1) return i;
        }
    return -1;
    }
};