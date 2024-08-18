import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> mpp = new HashMap<Integer,Integer>();
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int moreNeeded = target - num;
            if(mpp.containsKey(moreNeeded)) {
                ans[0] = i;
                ans[1] = mpp.get(moreNeeded);
                return ans;
            }
            mpp.put(num,i);
        }
        return ans;
    }
}