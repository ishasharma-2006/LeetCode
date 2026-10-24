class Solution {
    public String strWithout3a3b(int a, int b) {
        ArrayList<String> list=new ArrayList<>();
        while(a>0&&b>0){
            if(a>b){
                list.add("aab");
                a-=2;
                b--;
            }
            else if(b>a){
                list.add("bba");
                b-=2;
                a--;
            }
            else{
                list.add("ab");
                a--;b--;
            }
        }
         while(a > 0) {
            list.add("a");
            a--;
        }

        while(b > 0) {
            list.add("b");
            b--;
        }
       String s= String.join("",list);
       return s;
    }
}