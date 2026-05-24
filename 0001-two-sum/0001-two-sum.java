class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int res[] = new int[2];

        for (int i = 0; i < arr.length; i++) {
            int complimentNo = target - arr[i];

            if (mpp.containsKey(complimentNo)) {
                res[0] = mpp.get(complimentNo);
                res[1] = i;
                return res;
            }

            mpp.put(arr[i], i);
        }

        return res;
    }
}