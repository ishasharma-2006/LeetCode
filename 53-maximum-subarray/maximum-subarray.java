class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int current=0;
        for(int i=0;i<nums.length;i++){
            current+=nums[i];
            maxSum=Math.max(current,maxSum);
            if(current<0){
                current=0;
            }
        }
    return maxSum;
    }
}