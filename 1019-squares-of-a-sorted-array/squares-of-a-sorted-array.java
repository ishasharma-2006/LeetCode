class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr= new int[n];
        int i=0;
        int j=nums.length-1;
        int p=arr.length-1;
        while(i<=j){
            if(nums[i]*nums[i]>=nums[j]*nums[j]){
                arr[p]=nums[i]*nums[i];
                i++;  
                p--;
            }
            else if(nums[j]*nums[j]>nums[i]*nums[i]){
                arr[p]=nums[j]*nums[j];
                j--;
                p--;
            }
        }
        return arr;
    }
}