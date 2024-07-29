class Solution {
    public int maxFrequency(int[] nums, int k) {
        // 1. sort the array
        Arrays.sort(nums);

        // sliding window pattern
        // initialise all the constants
        int l = 0, r = 0; // left and right pointer
        int res = 0; // max freq
        long total = 0; //total of the current window size -> as long because of given constraints

        // base condition
        /*
        we have to expand the window side only when
        nums[r]*window size <= total + k;
        */
        // right pointer should not exceed the length of the array
        while(r < nums.length) {
            total +=nums[r];

            // check for incorrect scenario
            while((long) nums[r] * (r-l+1) > total + k) {
                total -=nums[l];
                l +=1;
            }

            // if scenario is correct we proceed further
            // update the res to compare with current res, window size
            // ensures that res always holds the maximum length of any valid window found so far.
            res = Math.max(res, r-l+1);
            r +=1;
        }
        return res;
    }
}