class Solution {
public:
    int heightChecker(vector<int>& heights) {
        vector<int> nums=heights;
        sort(nums.begin(),nums.end());
        int i=0,j=0,count=0;
        while(i<nums.size() && j<heights.size()){
            if(nums[i]!=heights[j]){
                count++;
                i++;
                j++;
            }
            else{ 
                i++;
                j++;
            }
        }
    return count;
    }
};