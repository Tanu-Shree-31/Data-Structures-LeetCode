class Solution {
    public boolean isAnagram(String s, String t) {

        // Step 1: Length check
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Frequency array
        int[] arr = new int[26];

        // Step 3: Increment for s, decrement for t
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        // Step 4: Check if all frequencies are zero
        for (int count : arr) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}