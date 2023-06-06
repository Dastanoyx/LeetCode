class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] output = new int[n];

        // The product of numbers to the left of the first element is just 1
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = nums[i - 1] * output[i - 1];
        }

        // The product of numbers to the right of the last element is just 1
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }

        return output;
    }

}