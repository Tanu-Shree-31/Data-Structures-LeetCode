class Solution {
    public int searchInsert(int[] arr, int target) {
        int n=arr.length;
        int low=0, high=n-1, ans=n;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target){
                ans=mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
}