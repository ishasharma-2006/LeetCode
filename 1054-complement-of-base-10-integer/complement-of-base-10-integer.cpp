class Solution {
public:
    int bitwiseComplement(int n) {
        if (n==0) return 1;
        int count=0,temp=n;
        while(n!=0){
            int digits=n%2;
            count++;
            n/=2;
        }
        int power=pow(2,count)-1;
        int ans = temp^power;
        return ans;
    }
};