class Solution {
public:
    int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            int digits=n%2;
            if(digits==1) count++;
            n/=2;
        }
    return count;
    }
};