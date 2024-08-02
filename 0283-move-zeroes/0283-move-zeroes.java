class Solution {
    public void moveZeroes(int[] nums) {
        // //O(2n)
        // int j =0;
        // int n=nums.length;
        // for(int i=0; i<n; i++){
        // if(nums[i]!=0){
        // nums[j] = nums[i];
        // j++;
        // }
        // }
        // for(int i=j; i<n; i++){
        // nums[i]=0;
        // }
        int j = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        // If no zero is found, no need to proceed
        if (j == -1)
            return;
        // find the next non -zero element to swap it
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                // swap nums[i] and nums[j]
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
    }
}