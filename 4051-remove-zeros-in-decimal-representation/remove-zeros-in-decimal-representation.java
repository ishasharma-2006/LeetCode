class Solution {
    public long removeZeros(long n) {
        ArrayList<Integer> li= new ArrayList<>();
        if (n==0){
            return 0;
        }
        while(n!=0){
            int d=(int)(n%10);
            if(d!=0){
                li.add(d);
            }
            n/=10;
        }
        Collections.reverse(li);
        StringBuilder sb = new StringBuilder();
        for (int x : li) {
            sb.append(x);
            }
        long ans = Long.parseLong(sb.toString());
        return ans;
    }
}