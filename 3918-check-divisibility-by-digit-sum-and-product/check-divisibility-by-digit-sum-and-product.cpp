class Solution {
public:
    bool checkDivisibility(int n) {
        int sum=0,prod=1,temp=n,c=n;
        if(n<10) return false;
        while(n!=0){
            int dig=n%10;
            sum+=dig;
            n/=10;
        }
        while(temp!=0){
            int d=temp%10;
            prod*=d;
            temp/=10;
        }
        if (c%(sum+prod)==0) return true;
        else return false;
    }
};