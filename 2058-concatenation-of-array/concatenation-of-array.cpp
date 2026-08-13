class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> v;
        for(int x: nums){
            v.push_back(x);
        }
        for(int x: nums){
            v.push_back(x);
        }
    return v;
    }
};