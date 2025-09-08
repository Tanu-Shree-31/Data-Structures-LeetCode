class Solution {
    public List<Integer> findPeaks(int[] arr) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<n-1; i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                list.add(i);
            }
        }
        return list;
    }
}