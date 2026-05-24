class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hc = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(hc.contains(nums[i])){
                return true;
            } else {
                hc.add(nums[i]);
            }
        }
        return false;
    }
}