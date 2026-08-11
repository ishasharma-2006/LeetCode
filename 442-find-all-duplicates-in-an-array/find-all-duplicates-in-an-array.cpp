class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        unordered_map<int,int> hm;
        vector<int> v;
        for(int i: nums){
            hm[i]++;
        }
        for(auto it: hm){
            if(it.second==2) v.push_back(it.first);
        }
    return v;
    }
};