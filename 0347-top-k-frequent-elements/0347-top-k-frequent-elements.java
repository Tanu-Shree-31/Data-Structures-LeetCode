class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. create the hashmap and for each number and its frequency
        Map<Integer, Integer> count = new HashMap<>();
        for(int n:nums){
            count.put(n,count.getOrDefault(n,0)+1);
        }

        //2. create the list of array
        // key - number of times its occuring
        // value - array because its the numbers in array
        // create empty one
        List<Integer>[] freq = new List[nums.length+1];
        for(int i=0; i<freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        // Step 3: Place each number into the correct frequency bucket
        for(Map.Entry<Integer,Integer> entry: count.entrySet()){
            int number = entry.getKey();
            int frequency = entry.getValue();
            freq[frequency].add(number);
        }

        // Step 4: Collect the top K frequent elements from the buckets
        int[] res=new int[k];
        int index=0;

        // Start from the highest frequency bucket and move downward
        for(int i=freq.length-1 ; i>0 && index<k; i--){
            for (int n: freq[i]){
                res[index++]=n;
                if(index==k){
                    return res;
                }
            }
        }
        return res;  
    }
}