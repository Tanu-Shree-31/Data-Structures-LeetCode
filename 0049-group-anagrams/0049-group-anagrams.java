class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mpp = new HashMap<>();
        
        for(String s: strs){
            // build the freq. array in each string
            int arr[] = new int[26];
            for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i) - 'a']++;
            }

            // convert the freq array to string - so that we can use in hashmap key

            String st ="";
            for(int j=0; j<arr.length; j++){
                // build a string and without # seperator, different frequency array can accidentally create same string.
                st = st + "#" + arr[j];                
            }

            if(!mpp.containsKey(st)){
                mpp.put(st,new ArrayList<>());
            } 
                
            mpp.get(st).add(s);
            

        }

        return new ArrayList<>(mpp.values());
    }
}