class Solution {
public:
    int maximumDifference(vector<int>& nums) {
        int minimum = nums[0];
        int maxDiff = -1;

        for (int j = 1; j < nums.size(); j++) {
            
            if (nums[j] > minimum) {
                maxDiff = max(maxDiff, nums[j] - minimum);
            }

            minimum = min(minimum, nums[j]);
        }

        return maxDiff;
    }
};