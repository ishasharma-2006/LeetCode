class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        while(n!=0){
            int dig=n%10;
            list.add(dig);
            n/=10;
        }
        Collections.sort(list,Collections.reverseOrder());
        return list.get(0)*list.get(1);

    }
}