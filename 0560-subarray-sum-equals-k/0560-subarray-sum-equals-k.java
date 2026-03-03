import java.util.*;
class Solution {
// The below two codes are for longestSubArray sum equals to K codes
//  Brute Solution
    // public int subarraySum(int[] nums, int k){
    //     int maxlen = 0;
    //     for(int i = 0; i < nums.length; i++){
    //         int sum = 0;
    //         for(int j = i; j < nums.length; j++){
    //             sum += nums[j];
    //             if(sum == k)
    //                 maxlen++;
    //         }
    //     }
    //     return maxlen;
    // }

//  Optimal Solution
    // public int subarraySum(int[] nums, int k) {
    //     int maxlen = 0;
    //     int sum = 0;
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for(int i = 0; i < nums.length; i++){
    //         sum += nums[i];
    //         if(sum == k)
    //             maxlen++;
    //         if(map.containsKey(sum - k))
    //             maxlen += map.get(sum - k);
    //         map.put(sum, map.getOrDefault(sum, 0) + 1);
    //     }
    //     return maxlen;
    // }

// The below is the code for count of sub Arrays sum equals to K
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}