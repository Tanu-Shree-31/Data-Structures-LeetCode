class Solution {
    public int longestConsecutive(int[] arr) {
        // Arrays.sort(arr);
        // int lastSmaller = Integer.MIN_VALUE, counter = 0, longest=1;
        // for(int i=0; i<arr.length; i++) {
        //     if(arr[i]-1 == lastSmaller){
        //         lastSmaller = arr[i];
        //         counter++;
        //     } else if(arr[i]!=lastSmaller){
        //         lastSmaller = arr[i];
        //         counter=1;
        //     }
        //     longest = Math.max(counter,longest);
        // }
        // return longest;


        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i< arr.length; i++){ //O(N)
            hashSet.add(arr[i]);
        }
        int longest=0;
        for(int i: hashSet){
            if(!hashSet.contains(i-1)){
                int counter = 1;
                int num = i;
                while(hashSet.contains(num+1)){
                    num++;
                    counter++;
                }
                longest = Math.max(counter,longest);
            }
        }
        return longest;
    }
}