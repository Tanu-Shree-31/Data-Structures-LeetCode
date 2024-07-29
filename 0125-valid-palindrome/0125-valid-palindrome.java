class Solution {
    public static boolean isPalindrome(String str) {
        boolean res = false;
        res = checkCharacters(0,str.length()-1,str.toLowerCase());
        return res;
    }

    private static boolean checkCharacters(int left, int right, String str) {
        if(left>=right) {
            return true;
        }

        if(!Character.isLetterOrDigit(str.charAt(left))) {
            return checkCharacters(left+1, right, str);
        }

        if(!Character.isLetterOrDigit(str.charAt(right))) {
            return checkCharacters(left, right-1, str);
        }

        if(str.charAt(left)!=str.charAt(right)) {
            return false;
        }

        return checkCharacters(left+1, right-1, str);
    }
}