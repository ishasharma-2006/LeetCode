class Solution {
public:
    int maxDistance(vector<int>& colors) {
        int i=0,j=colors.size()-1,dist1,dist2;
        while(colors[i]==colors[j]){
            j--;
        }
        dist1=abs(0-j);
        i=0;
        j=colors.size()-1;
        while(colors[i]==colors[j]){
            i++;
        }
        dist2=abs(i-j);
    return max(dist1,dist2);
    }
};