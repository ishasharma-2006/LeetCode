class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int r=k-1;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxSum=sum;
        while(r+1<nums.length){
            sum-=nums[l];
            sum+=nums[r+1];
            l++;
            r++;
            maxSum=Math.max(maxSum,sum);    
        }
    return (double) maxSum/k;
    }
}