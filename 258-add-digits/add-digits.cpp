class Solution {
public:
    int addDigits(int num) {
        int sum,temp=num;
        while(num>9){
            sum=0;
        
        while(num!=0){
            int digits=num%10;
            sum=sum+digits;
            num/=10;
        }num=sum;}
        return num;
    }
};