class Solution {
    public String addStrings(String num1, String num2) {
        int l=num1.length()-1;
        int r=num2.length()-1;
        int carry=0; int sum=0;
        StringBuilder sb = new StringBuilder();
        while(l>=0 || r>=0 || carry>0){
            int dig1= l>=0? num1.charAt(l)-'0': 0;
            int dig2= r>=0? num2.charAt(r)-'0': 0;
            sum=dig1+dig2+carry;
            sb.append(sum%10);
            carry=sum/10;

            l--;
            r--;
    }
    return sb.reverse().toString();
}
}