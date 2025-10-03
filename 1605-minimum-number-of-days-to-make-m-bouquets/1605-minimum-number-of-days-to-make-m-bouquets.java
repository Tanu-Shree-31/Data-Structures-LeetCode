class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();
        int n = bloomDay.length;
        int ans = -1;
        while(low<=high) {
            int mid = low +(high-low)/2;
            int arr[] = new int[n];
            int counter=0, bouquets=0;
            for (int i = 0; i < n; i++) {
                if (bloomDay[i] <= mid) {
                    counter++;
                    if (counter == k) {
                        bouquets++;
                        counter = 0; // reset after forming a bouquet
                    }
                } else {
                    counter = 0; // reset streak if flower not bloomed
                }
            }
            if (bouquets >= m) {
                ans = mid;       // mid works, try smaller day
                high = mid - 1;
            } else {
                low = mid + 1;   // mid too small, need more days
            }
        }
        return ans;
    }
}