class Solution {
public:
    int sumDivisibleByK(vector<int>& nums, int k) {
        unordered_map<int,int> hm;
        int sum=0;
        for(int x: nums){
            hm[x]++;
        }
        for(auto it: hm){
            if(it.second % k==0){
                sum+=it.first*it.second;
            }
        }
    return sum;
    }
};