class Solution {
public:
    int sumOfTheDigitsOfHarshadNumber(int x) {
        long long int digits,sum=0,temp=x;
        while(x!=0){
            digits=x%10;
            sum=sum+digits;
            x/=10;
        }
        if(temp%sum==0) return sum;
        else return -1;
    }
};