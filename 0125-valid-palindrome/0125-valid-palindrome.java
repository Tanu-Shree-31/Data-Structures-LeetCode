class Solution {
    public boolean isPalindrome(String s) {
        // Two pointers approach in one traversal without using another string
        int l = 0, r = s.length()-1;
        while(l<r){ // because the middle character is already equal to l and r, so you don't need l<=r
            // move until l is alphanumeric
            while(l < r && !alphaNumeric(s.charAt(l))) {
                l++;
            }

            // move until r is alphanumeric
            while(r > l && !alphaNumeric(s.charAt(r))) {
                r--;
            }

            // compare lowercase versions
            if(Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))) {
                l ++;
                r--;
            } else { // if both characters are not equal, then return false here only.
                return false;
            }

        }
        return true;
    }
 private static boolean alphaNumeric(char c) {
        if(c >='A' && c<='Z' || c>='a' && c<='z' || c>='0' && c<='9') return true;
        // can also use - Character.isLetterOrDigit(c);
        return false;
    }

}