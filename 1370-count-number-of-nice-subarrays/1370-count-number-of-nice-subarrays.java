class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        return helperMethod(arr, k) - helperMethod(arr, k - 1);
    }
private int helperMethod(int[] arr, int k) {
        int l=0,r=0,counter=0,count=0;
        while(r<arr.length) {
            if(arr[r]%2!=0) {
                counter++;
            }
            while(counter>k){ //shrink the window until the window is valid, which means when the number is odd
                if(arr[l]%2!=0){
                    counter--;
                }
                l++;
            }
            count = count + (r-l+1);
            r++;
        }
        return count;
    }

}