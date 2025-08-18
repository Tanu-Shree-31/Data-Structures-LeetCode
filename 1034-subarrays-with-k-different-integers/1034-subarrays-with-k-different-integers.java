class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
        // int maxlen=0;
        // for(int i=0; i<arr.length; i++){
        //     Map<Integer, Integer> freq = new HashMap<>();
        //     // Inner loop: expand the subarray
        //     for (int j = i; j < arr.length; j++) {
        //         freq.put(arr[j], freq.getOrDefault(arr[j], 0) + 1);
        //         if (freq.size() == k) {
        //             maxlen++;   // found a valid subarray
        //         } else if (freq.size() > k) {
        //             break;   // no point in expanding further
        //         }
        //     }
        // }
        // return maxlen;

        int res = helperMethod(arr,k) - helperMethod(arr,k-1);
        return res;

        
    }

    public int helperMethod(int[] arr, int k){
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int count=0,l=0,r=0;
        while(r<arr.length){
        mpp.put(arr[r],mpp.getOrDefault(arr[r],0)+1);
            while(mpp.size()>k){
                int val = mpp.get(arr[l]);
                mpp.put(arr[l],val-1);
                if(mpp.get(arr[l])==0){
                    mpp.remove(arr[l]);
                }
                l++;
            }
            
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
}