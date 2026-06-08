class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l =0;
        int r=0;
        int maxlen=0;
        while(l<=r && r<s.length()){
            // if element is not present in hashet
            if(!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                maxlen=Math.max(maxlen, r-l+1);
                r++;
            } else {
                // if element is present in hashset
                set.remove(s.charAt(l));
                l++;
            }
        }
        return maxlen;
    }
}