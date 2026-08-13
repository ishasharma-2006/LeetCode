class Solution {
public:
    bool validMountainArray(vector<int>& arr) {
        if (arr.size()<3) return false;
        int l=0,r=arr.size()-1;
        while(l<arr.size() && arr[l]<arr[l+1]){
            l++;
        }
        while(r>0 && arr[r]<arr[r-1]){
            r--;
        }
        if (l==r && l!=0 && l!=arr.size()-1) return true;
        else return false;
    }
};
