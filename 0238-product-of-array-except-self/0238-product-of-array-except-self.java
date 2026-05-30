class Solution {
    public int[] productExceptSelf(int[] nums) {
        // compute the left side product array
        int leftArr[] = new int[nums.length];
        int leftProd = 1;
        leftArr[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftProd = leftProd * nums[i-1];
            leftArr[i] = leftProd;
        }

        // using leftArr and original array, compute the ans
        int ans[] = new int[nums.length];
        int rightProd = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                rightProd = 1;
            } else {
                rightProd = rightProd * nums[i + 1];
            }
            ans[i] = rightProd * leftArr[i];

        }
        return ans;

    }
}