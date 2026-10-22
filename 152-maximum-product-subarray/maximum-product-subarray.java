class Solution {
    public int maxProduct(int[] nums) {
        int maxEnding=nums[0];
        int minEnding=nums[0];
        int allOver=nums[0];
        for(int i=1;i<nums.length;i++){
            int prevMax=maxEnding;
            int prevMin=minEnding;

            maxEnding=Math.max(nums[i],Math.max(prevMax*nums[i],prevMin*nums[i]));
            minEnding=Math.min(nums[i],Math.min(prevMax*nums[i],prevMin*nums[i]));

            allOver=Math.max(maxEnding,allOver);
        }
        return allOver;
    }
}