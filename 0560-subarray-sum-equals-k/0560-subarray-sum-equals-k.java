import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k){
        int maxlen = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == k)
                    maxlen++;
            }
        }
        return maxlen;
    }

    // public int subarraySum(int[] nums, int k) {
    //     int maxlen = 0;
    //     int sum = nums[0];
    //     int left = 0, right = 0;
    //     int n = nums.length;
    //     while(right < n){
    //         while(left <= right && sum > k){
    //             sum -= nums[left];
    //             left++;
    //         }
    //         if(sum == k)
    //             maxlen = Math.max(maxlen, right - left + 1);
    //         right++;
    //         if(right < n)
    //             sum += nums[right];
    //     }
    //     return maxlen;
    // }

    // public int subarraySum(int[] nums, int k) {
    //     int maxlen = 0;
    //     int sum = 0;
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for(int i = 0; i < nums.length; i++){
    //         sum += nums[i];
    //         if(sum == k)
    //             maxlen = i + 1;
    //         else{
    //             if(map.containsKey(sum))
    //                 maxlen = Math.max(maxlen, i - map.get(sum));
    //             else
    //                 map.put(sum, i);
    //         }
    //     }
    //     return maxlen;
    // }
}