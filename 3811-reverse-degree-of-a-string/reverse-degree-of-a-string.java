class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int degree=26-(s.charAt(i)-'a');
            ans+=(degree*(i+1));
        }
    return ans;
    }
}