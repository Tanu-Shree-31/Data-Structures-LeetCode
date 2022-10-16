class Solution {
    public int[] plusOne(int[] digits) {
         int index;
        for(index = digits.length - 1; index >= 0 &&digits[index] == 9; index--) {    
            digits[index] = 0;
        }
        if (index == -1) {  // edge case for all digits are 9, so becomes 1 with n zeroes
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;   // new int[] initialise with zeroes, so set first digit as 1
            return newDigits;
        }
        digits[index]++;    // found the non 9 digit, just add 1
        return digits;
    }
}