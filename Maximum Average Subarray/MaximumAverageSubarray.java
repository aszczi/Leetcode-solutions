class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0; 
        for(int i = 0; i < k; i++){
            maxSum+= nums[i];
        }
        int actualSum = maxSum;
        
        for(int i = 0; i < nums.length - k; i++){
            actualSum = actualSum - nums[i] + nums[i + k];
            if(actualSum > maxSum){
                maxSum = actualSum;
            }
        }

        double maxAverage = (double)maxSum/(double)k;
        return maxAverage;
    }
}
