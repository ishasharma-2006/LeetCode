class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> st= new HashSet<>();
        st.add('a');st.add('e');st.add('i');st.add('o');st.add('u');
        st.add('A');
        st.add('E');
        st.add('I');
        st.add('O');
        st.add('U');
        char[]arr= s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(st.contains(arr[i])&& st.contains(arr[j])){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(!st.contains(arr[j])){
                j--;
            }
            else if(!st.contains(arr[i])){
                i++;
            }
        }
        return new String(arr);
    }
}