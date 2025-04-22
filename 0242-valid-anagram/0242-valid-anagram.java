class Solution {
    public boolean isAnagram(String s, String t) {
        // O(s+t)
        // HashSet<Character> h = new HashSet<Character>();
        // for(int i=0; i<s.length(); i++){
        //     char c = s.charAt(i);
        //     h.add(c);
        // }
        // for(int i=0; i<t.length(); i++){
        //     char c = t.charAt(i);
        //     if(!h.contains(c)){
        //         return false;
        //     }
        // }
        // return true;

        if(s.length()!=t.length()){
            return false;
        }

        // HashMap<Character, Integer> countS = new HashMap<Character, Integer>();
        // HashMap<Character, Integer> countT = new HashMap<Character, Integer>();
        // for(int i=0; i<s.length(); i++) {
        //     countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i),0)+1);
        //     countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i),0)+1);
        // }
        // return countS.equals(countT);

        //TC: O(n)
        //SC: O(1) - operations of hashmap takes O(1)

        int[] count = new int[26];
        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int val: count){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}