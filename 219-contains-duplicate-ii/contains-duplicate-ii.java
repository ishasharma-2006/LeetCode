class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l=0;
        int r=0;

        HashSet<Integer> set=new HashSet<>();
        while(r<nums.length){
            if(!set.contains(nums[r])){
                set.add(nums[r]);
                r++;
            }
            else if (set.contains(nums[r])) return true;
            while(r-l>k){
                set.remove(nums[l]);
                l++;
            }
        }
        return false;
    }
}