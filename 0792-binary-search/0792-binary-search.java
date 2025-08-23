class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n-1, mid =-1;
        while(high>=low){
            mid = high+low/2;
            if(arr[mid] == target) return mid;
            else if (target>arr[mid]) low = mid +1;
            else high = mid-1;
        }
        return -1;
    }
}