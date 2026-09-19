class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> set3=new HashSet<>();

        for(int n: nums1){
            set1.add(n);
        }
        for(int n: nums2){
            set2.add(n);
        }
        for(int n: nums3){
            set3.add(n);
        }
        HashSet<Integer> allNums=new HashSet<>();
        for(int n: nums1){
            allNums.add(n);
        }
        for(int n: nums2){
            allNums.add(n);
        }
        for(int n: nums3){
            allNums.add(n);
        }

        ArrayList<Integer> ans=new ArrayList<>();
        for(int n: allNums){
            if(set1.contains(n)&&set2.contains(n)){
                ans.add(n);
            }
            else if(set2.contains(n)&&set3.contains(n)){
                ans.add(n);
            }
            else if(set1.contains(n)&&set3.contains(n)){
                ans.add(n);
            }
        }
    return ans;
    }
}