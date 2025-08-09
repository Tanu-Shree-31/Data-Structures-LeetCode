class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r=0, maxlen=0;
        int n = s.length();
        HashMap<Character,Integer> mpp = new HashMap<>();
        while (r < n) {
            if (mpp.containsKey(s.charAt(r))) {
                // Move l to one position after last occurrence of ch
                l = Math.max(l, mpp.get(s.charAt(r)) + 1);
            }
            mpp.put(s.charAt(r), r); // update last seen index
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }
}