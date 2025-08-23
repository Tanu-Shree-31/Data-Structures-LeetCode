class Solution {
    public int[] searchRange(int[] arr, int x) {
        int first = firstOccurance(arr, x);
        if(first==-1){
            return new int[]{-1, -1};
        }
        int last = lastOccurance(arr, x);
        return new int[]{first, last};
    }

    private int lastOccurance(int[] arr, int x) {
        int low=0, high=arr.length-1, last=-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid]==x){
                last=mid;
                low=mid+1;
            } else if(arr[mid]<x){
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return last;
    }

    private int firstOccurance(int[] arr, int x) {
        int low=0,high= arr.length-1, first=-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid]==x){
                first=mid;
                high=mid-1;
            } else if(arr[mid]<x){
                low=mid+1;
            } else{
                high = mid-1;
            }
        }
        return first;
    }
}