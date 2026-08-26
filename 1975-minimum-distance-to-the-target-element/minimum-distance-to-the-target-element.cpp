class Solution {
public:
    int getMinDistance(vector<int>& nums, int target, int start) {
        int min1,min2;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==target){
                min1=abs(i-start);
            }
        }
        for(int j=nums.size()-1;j>=0;j--){
            if(nums[j]==target){
                min2=abs(j-start);
            }
        }
    return min(min1,min2);
    }
};