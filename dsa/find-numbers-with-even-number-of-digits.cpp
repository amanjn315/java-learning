// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=daily-question&envId=2025-04-30

class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int n = nums.size();
        int ans = 0;
        for(int i = 0; i < n; i++){
            int num = nums[i];
            int count = 0;
            while(num != 0){
                count++;
                num /= 10;
            }
            if(count % 2 == 0){
                ans++;
            }
        }
        return ans;
    }
};