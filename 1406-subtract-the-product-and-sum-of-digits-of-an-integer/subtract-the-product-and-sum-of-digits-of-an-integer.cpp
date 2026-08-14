class Solution {
public:
    int subtractProductAndSum(int n) {
        int sum=0, prod=1, temp=n;
        while(n!=0){
            int digits=n%10;
            sum+=digits;
            n/=10;
        }
        while(temp!=0){
            int dig=temp%10;
            prod*=dig;
            temp/=10;
        }
        int ans = prod-sum;
        return ans;
    }
};