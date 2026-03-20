class Solution {
//  Brute Solution -- O(N)
    // public int search(int[] nums, int target) {
    //     for(int i = 0; i < nums.length; i++){
    //         if(nums[i] == target)
    //             return i;
    //     }
    //     return -1;
    // }

//  Optimal Solution -- O(log N)
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target)
                return mid;
            else if(target > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}