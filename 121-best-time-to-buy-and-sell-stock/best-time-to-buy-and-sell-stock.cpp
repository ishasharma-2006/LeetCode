class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minimum = prices[0];
        int maxDiff = 0;

        for (int j = 1; j < prices.size(); j++) {
            
            if (prices[j] > minimum) {
                maxDiff = max(maxDiff, prices[j] - minimum);
            }

            minimum = min(minimum, prices[j]);
        }

        return maxDiff;
    }
};