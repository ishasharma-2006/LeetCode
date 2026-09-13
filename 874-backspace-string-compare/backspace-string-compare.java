class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> t1 = new Stack<>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)!='#'){
                s1.push(s.charAt(i));
            }
            else if(!s1.isEmpty()){
                s1.pop();
            }
        i++;
        }
        int j=0;
        while(j<t.length()){
            if(t.charAt(j)!='#'){
                t1.push(t.charAt(j));
            }
            else if(!t1.isEmpty()){
                t1.pop();
            }
            j++;}
        if(s1.equals(t1)) return true;
        else return false;
    }
}