class Solution {
    public void moveZeroes(int[] nums) {
        int a = 0;
        int size = nums.length;
        int number_of_zeros = 0;
        int current = 0;
        for(int i = 0; i < size; i++){
            if(nums[i] == 0){
                number_of_zeros++;
            }else{
                nums[current] = nums[i];
                current++;
            }
        }
        for(int i = 1; i <= number_of_zeros; i++){
            nums[size - i] = 0;
        }
    }
}