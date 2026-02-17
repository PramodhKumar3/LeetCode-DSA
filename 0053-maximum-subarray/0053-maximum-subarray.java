class Solution {
    // public int maxSubArray(int[] nums) {
    //     long maxi = Long.MIN_VALUE;
    //     int sum = 0;
    //     for(int i = 0; i < nums.length; i++){
    //         sum += nums[i];
    //         if(sum > maxi)
    //             maxi = sum;
    //         if(sum < 0)
    //             sum = 0;
    //     }
    //     return (int) maxi;
    // }

    public int maxSubArray(int[] nums) {
        int maxi = nums[0];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            maxi = Math.max(sum, maxi);
            if(sum < 0)
                sum = 0;
        }
        return maxi;
    }
}