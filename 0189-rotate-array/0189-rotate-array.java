class Solution {
    public void rotate(int[] nums, int k) {
         k = k % nums.length; // This ensures k is within the bounds of the array length.
        if (k == 0) return; // If k is 0, no rotation is needed.
        // reverse last k elements
        reverseArray(nums,nums.length-k, nums.length-1);
        // reverse first n-k elements
        reverseArray(nums,0,nums.length-k-1);
        // reverse whole array
        reverseArray(nums,0,nums.length-1); 
    }
    public void reverseArray(int[] nums, int start, int end) {
         while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}