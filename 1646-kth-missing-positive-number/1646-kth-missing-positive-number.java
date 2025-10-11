class Solution {
    public int findKthPositive(int[] arr, int k) {
        int noOfMissingEle[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int res = arr[i] - (i+1);
            noOfMissingEle[i] = res;
        }
        int low = 0, high = noOfMissingEle.length-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(noOfMissingEle[mid]<k){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        if(low==0) return k;
        return arr[high] + (k - noOfMissingEle[high]);
    }
}