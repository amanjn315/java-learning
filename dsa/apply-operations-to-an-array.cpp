// https://leetcode.com/problems/apply-operations-to-an-array/submissions/1621549713/?envType=daily-question&envId=2025-04-30
class Solution {
    public:
        vector<int> applyOperations(vector<int>& nums) {
            int n = nums.size();
            for(int i = 0; i < n - 1; i++){
                if(nums[i] == nums[i + 1]){
                    nums[i] *= 2;
                    nums[i + 1] = 0;
                }
            }
    
            int i = 0, j = 0;
            while(i < n and nums[i] != 0){
                i++;
            }
            j = i + 1;
            while(i < n and j < n){
                if(nums[j] != 0){
                    swap(nums[i], nums[j]);
                    i++;j++;
                }
                else{
                    j++;
                }
            }
            return nums;
        }
    };