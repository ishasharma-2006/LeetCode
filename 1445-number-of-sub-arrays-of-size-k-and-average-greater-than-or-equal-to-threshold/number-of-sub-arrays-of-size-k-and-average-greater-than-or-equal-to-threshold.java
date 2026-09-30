class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0;int r=k-1;
        int sum=0;int count=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>=k*threshold){
                count++;
            }
        while(r+1<arr.length){
            sum-=arr[l];
            sum+=arr[r+1];
            l++;r++;
            if(sum>=k*threshold){
                count++;
            }
        }
        return count;
    }
}