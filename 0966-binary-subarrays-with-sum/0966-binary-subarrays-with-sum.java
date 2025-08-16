class Solution {
    public int numSubarraysWithSum(int[] arr, int goal) {
        return helperMethod(arr, goal) - helperMethod(arr, goal - 1);
    }

    public int helperMethod(int arr[], int goal) {
        if (goal < 0) return 0; 
        int l=0,r=0,count=0,sum=0,n=arr.length;
        while(r<n){
            sum=sum+arr[r];
            while(sum>goal){
                sum=sum-arr[l];
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
}