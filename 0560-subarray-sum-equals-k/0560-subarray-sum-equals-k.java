import java.util.*;
class Solution {
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
    public int subarraySum(int[] nums, int k) {
        int maxlen = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum == k)
                maxlen++;
            if(map.containsKey(sum - k))
                maxlen += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return maxlen;
    }
}