class Solution {
    public int missingNumber(int[] nums) {
        int xor1 = 0, xor2 = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            xor1 = xor1 ^ i; // xor of 1 -> n-1
            xor2 = xor2 ^ nums[i]; // xor of all array elements
        }
        xor1 = xor1 ^ n;
        return (xor1 ^ xor2);
    }
}