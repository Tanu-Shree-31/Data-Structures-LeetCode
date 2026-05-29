class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // brute force approach - using sorting
        HashMap<Integer,Integer> mpp = new HashMap<>();
        // step1: build the number : freq hashmap
        for(int i: nums){
            mpp.put(i, mpp.getOrDefault(i, 0)+1);
        }
        // step2: sort this hashmap based on frequencies
        // for sorting operation, we need to add these (k,v) pair in list
        // in list we will have as (v,k) - as we need to sort by frequencies
        List <int[]> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: mpp.entrySet()){
            list.add(new int[] {entry.getValue(), entry.getKey()});
        }
        // step 3: sort this list based on frequencies descending order
        list.sort((a,b)->b[0]-a[0]); 
        int res[] = new int[k];
        for(int i=0; i<k; i++){
            res[i] = list.get(i)[1]; // get the 2nd ele, which is original value/ number
        }
        return res;
    }
}