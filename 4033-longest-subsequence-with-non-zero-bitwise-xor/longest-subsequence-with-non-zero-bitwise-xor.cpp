class Solution {
public:
    int longestSubsequence(vector<int>& nums) {
        int Xor=0,count=0; 
        for(int i=0; i<nums.size();i++){
            Xor^=nums[i];
        }
        if(Xor!=0) return nums.size();
        else if(Xor==0){
            for(int i=0; i<nums.size();i++){
                if(nums[i]==0) count++;
            }
            if(count==nums.size()) return 0;
            else return nums.size()-1;
        }
    return 0;
    }
};