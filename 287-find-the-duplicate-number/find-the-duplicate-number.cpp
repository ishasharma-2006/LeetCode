class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        unordered_map<int,int>hm;
        for(int i: nums){
            hm[i]++;
        }
        for(auto it:hm){
            if(it.second>1) return it.first;
        }
    return {};
    }
};