class Solution {
    public int numberOfSubstrings(String s) {
         int lastSeen[] = {-1,-1,-1};
         int count = 0, n = s.length();
        for(int i=0; i<n; i++){
            lastSeen[s.charAt(i)-'a'] = i; //the array holds the last seen index
            if(lastSeen[0]!=-1 && lastSeen[1]!=-1 && lastSeen[2]!=-1){
                count = count + (1+Math.min(lastSeen[0],Math.min(lastSeen[1],lastSeen[2])));
            }
        }
        return count;
    }
}