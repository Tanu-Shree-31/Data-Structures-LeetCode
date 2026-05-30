class Solution {
    public int longestConsecutive(int[] nums) {
        // Add all ele's to a hashset.
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums)
            set.add(i);
        // find the starts
        int maxlen=0;
        for(int i: set) {
            if(!set.contains(i-1)){
                // it is a start
                int counter = 1;
                while(set.contains(i+1)){
                    // it is a consectutive sequence
                    counter++;
                    i++;
                }
                maxlen = Math.max(maxlen, counter );
            } 
        }
        return maxlen;
    }
}