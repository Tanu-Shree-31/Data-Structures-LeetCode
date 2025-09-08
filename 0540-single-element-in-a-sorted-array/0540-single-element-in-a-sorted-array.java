class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        // Edge cases: check if the single element is at the very beginning or very end
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        int low=1, high = n-2;
        while(low<=high){
            int mid = low+(high-low)/2;
            // A single element will NOT equal both neighbors
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
                return arr[mid];
             /*
       Core logic: decide which half to eliminate
       Idea: Before the single element → pairs are aligned as (even, odd).
             After the single element → pairs are aligned as (odd, even).

       So we check:
       - If mid is odd and pairs with mid-1 → pattern is fine till here → go right.
       - If mid is even and pairs with mid+1 → pattern is fine till here → go right.
       Else → pairing broken → unique element must be on the left.
    */
            if(mid%2==1 && arr[mid]==arr[mid-1]
            || mid%2==0 && arr[mid]==arr[mid+1]){
                // Pairing is normal → answer is on right
                low = mid+1;
            } else {
                // Pairing broken → answer is on left (mid already checked above)
                high = mid-1;
            }
        }
        return -1;
    }
}