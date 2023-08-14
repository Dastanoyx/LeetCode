class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        
        // Calculate the initial sum of the first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        // Initialize the maximum sum as the sum of the first window
        int maxSum = sum;
        
        // Slide the window and update the sum
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        
        // Calculate the maximum average by dividing maxSum by k
        double maxAverage = (double) maxSum / k;
        
        return maxAverage;
    }
}