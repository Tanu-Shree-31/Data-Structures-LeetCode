class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        String str = s.trim();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                len++;

            } else {
                if (len > 0)
                    return len;
            }
        }
        return len;

    }
}