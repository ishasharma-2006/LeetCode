class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        unordered_set<int>s;
        for(int i: nums){
          if(i>0) s.insert(i);
        }
        int j=1;
        while(s.find(j)!=s.end()){
            j++;
        }
    return j;
    }
};