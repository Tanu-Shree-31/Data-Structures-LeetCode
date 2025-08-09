class Solution {
    public int longestOnes(int[] arr, int k) {
        int l=0, r=0, maxlen=0, zeroCounter=0;
        while(r<arr.length) {
            if(arr[r]==0){
                zeroCounter++;
            }
            while(zeroCounter>k){
                if(arr[l]==0) {
                    zeroCounter--;
                }
                l++;
            }
            maxlen = Math.max(maxlen, r-l+1);
            r++;
        }
        return maxlen;
    }
} 