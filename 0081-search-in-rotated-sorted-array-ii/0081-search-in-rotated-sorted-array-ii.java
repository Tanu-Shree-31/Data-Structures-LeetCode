class Solution {
    public boolean search(int[] arr, int x) {
        int low=0,high=arr.length-1,ans=-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==x){
                return true;
            }
            // edge case
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low++;
                high--;
                continue; // to check if there is any more 
            }
            if(arr[low]<=arr[mid]){ //left arr is sorted
                if(arr[low]<=x && x<=arr[mid]){ // check if x is btw low to mid
                    high = mid-1;
                } else {
                    low=mid+1;
                }
            } else { // right half is sorted
                if(arr[mid]<=x && x<=arr[high]){ //check if x is btw mid to high
                    low = mid+1;
                } else {
                    high=mid-1;
                }
            }
        }
        return false;
    }
}