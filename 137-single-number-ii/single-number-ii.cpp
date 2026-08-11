class Solution {
public:
    int singleNumber(vector<int>& nums) {
        unordered_map<int,int> hm;
        for(int n: nums){
            hm[n]++;
        }
        for(auto it: hm){
            if(it.second==1) return it.first;
        }
    return {};
    }
};