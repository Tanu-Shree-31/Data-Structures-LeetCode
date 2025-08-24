class Solution {
    public int findMin(int[] arr) {
        int low=0,high=arr.length-1,ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid = low + (high-low)/2;
            //search space is already sorted
            //then arr[low] will always be
            //the minimum in that search space:
            if (arr[low] <= arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }
            if(arr[low]<=arr[mid]){ //left portion is sorted
                ans = Math.min(ans,arr[low]);
                low=mid+1;
            } else { //right portion is unsorted
                ans = Math.min(ans,arr[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}