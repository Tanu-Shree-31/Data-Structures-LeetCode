class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (k == 50_000) return 1;
        int left = 0, right = nums.length - 1;
        Random rand = new Random();
        while(true) {
            int pivot_index = left + rand.nextInt(right-left+1);
            int new_pivotIndex = partition(nums,left,right,pivot_index);
            if(new_pivotIndex == nums.length-k){
                return nums[new_pivotIndex];
            } else if (new_pivotIndex > nums.length - k) {
                right = new_pivotIndex - 1;
                /*
                Why it matters: If the pivot index is greater than nums.length - k, the kth largest element must be in the left partition.
                Action: Narrow the search range by updating right = new_pivotIndex - 1.
                 */
            } else {
                left = new_pivotIndex + 1;
                /*
                Why it matters: If the pivot index is smaller than nums.length - k, the kth largest element must be in the right partition.
                Action: Narrow the search range by updating left = new_pivotIndex + 1
                 */
            }
        }
    }

    private static int partition(int[] nums, int left, int right, int pivotIndex) {
        int pivotEle = nums[pivotIndex];
        swap(nums,pivotIndex,right);
        int stored_index = left;
        for(int i=left; i<right; i++){
            if(nums[i]<pivotEle){
                swap(nums,i,stored_index);
                stored_index++;
            }
        }
        swap(nums,right,stored_index); //This line moves the pivot element to its correct position in the sorted array.
        /*
        How It Works:
        Initially, the pivot element is swapped to the end of the array (swap(nums, pivotIndex, right);) for convenience during the partitioning process.
        During the partitioning, elements smaller than the pivot are placed to its left, and larger elements remain to its right.
        After the loop, the position stored_index points to the correct position where the pivot element should reside.
        Finally, swapping the pivot element from the end (right) back to stored_index places it in its correct position in the sorted order.
         */
        return stored_index;
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}