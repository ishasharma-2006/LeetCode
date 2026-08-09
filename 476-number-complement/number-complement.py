class Solution(object):
    def findComplement(self, num):
        count=0
        temp=num
        while(num!=0):
            digits=num%2
            count+=1
            num//=2
        power=(2**count)-1
        return power^temp
        