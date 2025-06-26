class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map<String, List<String>> mpp = new HashMap<>();
        // for(String s: strs){
        //     char[] charArray = s.toCharArray();
        //     Arrays.sort(charArray);
        //     String sortedS = new String(charArray);
        //     mpp.putIfAbsent(sortedS, new ArrayList<>());
        //     mpp.get(sortedS).add(s);
        // }
        // return new ArrayList<>(mpp.values());
        // above TC is O(n*mlogm) mlogm is for sorting of each string and n is for total number of strings

        //to optimise this - we will have to reduce the sorting TC which is mlogm to somethng which is m. Hence using the hash array approach.

        Map<String, List<String>> mpp = new HashMap<>();
        for(String s: strs){
            int[] count = new int[26];
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            mpp.putIfAbsent(key, new ArrayList<>());
            mpp.get(key).add(s);
        }
        return new ArrayList<>(mpp.values());

    }
}