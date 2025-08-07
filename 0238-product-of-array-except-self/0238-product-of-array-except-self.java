class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        
        res[0] = 1;
        for(int i=1; i<n; i++){
            res[i] = res[i-1] * arr[i-1]; // calculating the prefix in the res array only
        }

        // we dont want the last pos bcz already it would be same as prefixsum value
        int suffix = 1;
        for(int i=n-2; i>=0; i--){
            suffix = suffix * arr[i+1];
            res[i] = suffix * res[i];
        }
        return res;
    }
}