class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high=0, ans=-1;
        for(int i=0; i<weights.length; i++){
            high = high+weights[i];
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            int sum=0, noOfDays=1;
            for(int i=0; i<weights.length; i++){
                sum = sum + weights[i];
                if(sum>mid){
                    noOfDays++;
                    sum = weights[i];
                }
            }
            if(noOfDays<=days){
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
}