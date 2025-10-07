class Solution {
    public int findKthPositive(int[] arr, int k) {
        // int noOfMissingEle[] = new int[arr.length];
        // for(int i=0; i<arr.length; i++){
        //     int res = arr[i] - (i+1);
        //     noOfMissingEle[i] = res;
        // }
        int low = 0, high = arr.length-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            int noOfMissingEle = arr[mid] - (mid+1);
            if(noOfMissingEle<k) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        if(high == -1) return k;
        int missingBefore = arr[high] - (high + 1);
        return arr[high] + (k - missingBefore);
    }
}