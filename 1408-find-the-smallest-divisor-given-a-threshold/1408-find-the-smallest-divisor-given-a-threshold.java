class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = Arrays.stream(nums).max().getAsInt();
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                int divisor = (nums[i] + mid - 1) / mid;
                sum = sum + divisor;
            }
            if (sum <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}