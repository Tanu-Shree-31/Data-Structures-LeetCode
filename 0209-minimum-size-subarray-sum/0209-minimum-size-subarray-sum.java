class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int size = Integer.MAX_VALUE, sum = 0;
        int i = 0; 

        for (int j = 0; j < arr.length; j++) { 
            sum += arr[j];

            // Shrink the window until the sum is less than the target
            while (sum >= target) {
                size = Math.min(size, j - i + 1);
                sum -= arr[i];
                i++;
            }
        }

        return size == Integer.MAX_VALUE ? 0 : size;
    }

}
