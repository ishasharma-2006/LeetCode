class Solution {
public:
    int maximizeExpressionOfThree(vector<int>& nums) {
        int ans,n=nums.size()-1;
        sort(nums.begin(),nums.end());
        ans=nums[n]+nums[n-1]-nums[0];
        return ans;
    }
};