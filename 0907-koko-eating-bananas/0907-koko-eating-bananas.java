class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = Arrays.stream(piles).max().getAsInt(), n=piles.length, res=Integer.MAX_VALUE;
        while(low<=high){
            int mid = low + (high-low)/2;
            long sumOfHours = 0;
            for(int i=0; i<n; i++){
                long noOfBanannas = (piles[i] + mid - 1L) / mid;
                sumOfHours = sumOfHours + noOfBanannas;
                if(sumOfHours>h){
                    break;
                }
            }
            if(sumOfHours <= h){
                res = Math.min(mid,res);
                high = mid -1;
            } else {
                low = mid+1;
            }
        }
        return res;
    }
}