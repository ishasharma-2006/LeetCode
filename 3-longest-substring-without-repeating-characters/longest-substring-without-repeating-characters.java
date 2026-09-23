class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int r=0;
        int max=0;
        if(s.length()==1) return 1;
        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                max=Math.max(max,r-l+1);
                set.add(s.charAt(r));
                r++;
            }
            else if(set.isEmpty()){
                set.add(s.charAt(r));
                r++;
            }
            else{
                
                set.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
}