class Solution {
    public boolean isPalindrome(String s) {
        String t="";
        for (char ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                t+=Character.toLowerCase(ch);
            }
        }
        int i=0;
        int j=t.length()-1;
        while(i<j){
            if(t.charAt(i)!=t.charAt(j)) return false;
            else if(t.charAt(i)==t.charAt(j)){
                i++;
                j--;
            }
        }
    return true;
    }
}