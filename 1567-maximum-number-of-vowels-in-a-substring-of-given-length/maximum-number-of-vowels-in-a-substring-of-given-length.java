class Solution {
    public int maxVowels(String s, int k) {
        int count=0;int l=0;int r=k-1;int max=0;
        for(int i=0;i<k;i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
                max=count;
            }
        }
        while(r+1<s.length()){
            if(s.charAt(l) == 'a' || s.charAt(l) == 'e' || s.charAt(l) == 'i' || s.charAt(l) == 'o' || s.charAt(l) == 'u'){
                count--;
            }
            if(s.charAt(r+1) == 'a' || s.charAt(r+1) == 'e' || s.charAt(r+1) == 'i' || s.charAt(r+1) == 'o' || s.charAt(r+1) == 'u'){
                count++;
            }
            l++;
            r++;
            max=Math.max(max,count);
        }
        return max;
    }
}