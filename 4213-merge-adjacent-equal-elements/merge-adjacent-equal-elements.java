class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> stack=new Stack<>();
        for(long n: nums){
            long curr=n;
            while(!stack.isEmpty()&&stack.peek()==curr){
                curr=curr+stack.pop();
            }
            stack.push(curr);
        }
        return new ArrayList<>(stack);
    }
}