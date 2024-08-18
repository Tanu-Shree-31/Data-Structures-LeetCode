class Solution {
    public int majorityElement(int[] arr) {
        int ele = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                ele = arr[i];
            } else if (arr[i] == ele) {
                count++;
            } else {
                count--;
            }
        }
        return ele;
    }
}