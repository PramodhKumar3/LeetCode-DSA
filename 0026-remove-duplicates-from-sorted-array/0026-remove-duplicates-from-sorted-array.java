class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[index]){
                nums[index + 1] = nums[j];
                index++;
            }
        }
        return index + 1;
    }
}