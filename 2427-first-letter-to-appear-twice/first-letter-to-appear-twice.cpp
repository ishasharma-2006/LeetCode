class Solution {
public:
    char repeatedCharacter(string s) {
        unordered_set<char> t;
        for(auto x: s){
            if(t.find(x)!=t.end()){
                return x;
            }
            else t.insert(x);
        }
    return '\0';
    }
};