class Solution {
    public String reverseParentheses(String s) {
        StringBuilder stack=new StringBuilder();
        for(char c: s.toCharArray()){
            if(c==')'){
                StringBuilder rev=new StringBuilder();
                while(stack.charAt(stack.length()-1)!='('){
                    rev.append(stack.charAt(stack.length()-1));
                    stack.deleteCharAt(stack.length()-1);
                }
                stack.deleteCharAt(stack.length()-1);
                stack.append(rev);
            }
            else{
                stack.append(c);
            }
        }
        return stack.toString();
    }
}