// https://leetcode.com/problems/random-point-in-non-overlapping-rectangles/
class Solution {
    int[][] rects;
    int[] prefixSum;
    Random rand = new Random();

    public Solution(int[][] rects) {
        this.rects = rects;
        prefixSum = new int[rects.length];
        int sum = 0;

        for(int i = 0; i < rects.length; i++){
            int[] r = rects[i];
            int area = ((r[2] - r[0] + 1) * (r[3] - r[1] + 1));
            sum += area;
            prefixSum[i] = sum;
        }
    }
    
    public int[] pick() {
        int target = rand.nextInt(prefixSum[prefixSum.length - 1]) + 1;

        // Binary search to find the rectangle
        int left = 0, right = prefixSum.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (prefixSum[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // Get a random point from rects[left]
        int[] r = rects[left];
        int width = r[2] - r[0] + 1;
        int height = r[3] - r[1] + 1;

        int x = r[0] + rand.nextInt(width);
        int y = r[1] + rand.nextInt(height);
        return new int[]{x, y};
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(rects);
 * int[] param_1 = obj.pick();
 */