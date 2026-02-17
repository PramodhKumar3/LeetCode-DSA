// import java.util.*;
// class Solution {
// //  Better Solution O(N) + O(N log N)
//     public int majorityElement(int[] nums) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int i : nums){
//             if(!map.keySet().contains(i))
//                 map.put(i, 1);
//             else
//                 map.put(i, map.get(i) + 1);
//         }
//         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//             if(entry.getValue() > nums.length / 2)
//                 return entry.getKey();
//         }
//         return -1;
//     }
// }

class Solution{
//  Optimal Solution
    public int majorityElement(int[] nums){
        // 1. Applying Moore's Voting Algorithm
        int cnt = 0, ele = 0;
        for(int i = 0; i < nums.length; i++){
            if(cnt == 0) {
                cnt = 1;
                ele = nums[i];
            } else if(ele == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        // 2. Verifying if the element is majority or not
        int cnt1 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == ele){
                cnt1++;
            }
        }
        // 3. Returning majority element
        if(cnt1 > nums.length / 2)
            return ele;
        return -1;
    }
}