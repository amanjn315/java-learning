// https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/description/
class SolutionB {
    public int minSwaps(String s) {
        int n = s.length();
        int i = 0, j = n - 1;
        int i_count = 0, j_count = 0;
        int ans = 0;
        while(i < j){
            if(s.charAt(i) == ']' && i_count > 0){
                i++;
                i_count--;
            }
            else if(s.charAt(j) == '[' && j_count > 0){
                j--;
                j_count--;
            }
            else if(s.charAt(i) == '['){
                i++;
                i_count++;
            }
            else if(s.charAt(j) == ']'){
                j--;
                j_count++;
            }
            else if(s.charAt(i) == ']' && s.charAt(j) == '['){
                ans++;
                i++;j--;
                i_count++;j_count++;
            }
        }
        return ans;
    }
}