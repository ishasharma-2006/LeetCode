class Solution {
public:
    int mirrorDistance(int n) {
        long long int rev=0,temp=n;
        while(n!=0){
            int dig=n%10;
            rev=rev*10+dig;
            n/=10;
        }
        return abs(temp-rev);
    }
};