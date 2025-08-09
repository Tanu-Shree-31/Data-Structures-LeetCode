class Solution {
    public int maxScore(int[] arr, int k) {
        int leftSum = 0, rightIndex=arr.length-1, rightSum=0, sum = 0, maxSum=0;
        for(int i=0; i<k; i++){
            leftSum = leftSum+arr[i];
            maxSum = leftSum;
        }
        for(int i=k-1; i>=0; i--){
            leftSum = leftSum - arr[i];
            rightSum = rightSum + arr[rightIndex];
            rightIndex = rightIndex-1;
            maxSum = Math.max(maxSum,(leftSum+rightSum));
        }
        return maxSum;
    }
}