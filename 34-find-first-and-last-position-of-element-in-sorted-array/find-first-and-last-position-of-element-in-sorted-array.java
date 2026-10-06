class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstRange(nums,target);
        int last=lastRange(nums,target);
        return new int[] {first,last};
        }
        public static int firstRange(int[] nums,int target){
        int l=0;
        int r=nums.length-1;
        int first=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]<target){
                l=mid+1;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                first=mid;
                r=mid-1;
            }
            }return first;
            }

        public static int lastRange(int[] nums,int target){
        int l=0;
        int r=nums.length-1;
        int last=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]<target){
                l=mid+1;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                last=mid;
                l=mid+1;
            }
        }return last;
        }}
        
    
