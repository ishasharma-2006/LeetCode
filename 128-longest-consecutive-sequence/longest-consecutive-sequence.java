class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int n: nums){
            hs.add(n);
        }
        int current,length,maxLength=0;
        for(int n: hs){
            if(hs.contains(n-1)){
                continue;
            }
            else{
                current=n;
                length=1;
            }
            while(hs.contains(current+1)){
                current++;
                length++;
            }
            maxLength=Math.max(length,maxLength);
        }
        return maxLength;
    }
}