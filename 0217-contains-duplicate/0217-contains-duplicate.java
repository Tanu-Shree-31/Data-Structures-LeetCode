class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> n = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            n.add(nums[i]);
        }
        if(nums.length == n.size()){
            return false;
        } else {
            return true;
        }
    }

    // time complexity: O(N)
    // Space complexity: O(N)
}