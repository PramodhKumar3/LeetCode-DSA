// import java.util.*;
// class Solution {
//     // Better Solution TC -> O(N log N)
//     public List<Integer> majorityElement(int[] nums) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int i : nums){
//             if(!map.keySet().contains(i))
//                 map.put(i, 1);
//             else
//                 map.put(i, map.get(i) + 1);
//         }
//         List<Integer> list = new ArrayList<>();
//         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//             if(entry.getValue() > nums.length / 3)
//                 list.add(entry.getKey());
//         }
//         return list;
//     }
// }

class Solution{
//  Optimal Solution -- O(2N)
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0, ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(cnt1 == 0 && nums[i] != ele2){
                cnt1 = 1;
                ele1 = nums[i];
            } else if(cnt2 ==0 && nums[i] != ele1){
                cnt2 = 1;
                ele2 = nums[i];
            } else if(ele1 == nums[i]) cnt1++;
            else if(ele2 == nums[i]) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> list = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(ele1 == nums[i]) cnt1++;
            if(ele2 == nums[i]) cnt2++;
        }
        if(cnt1 > (nums.length / 3)) 
            list.add(ele1);
        if(cnt2 > (nums.length / 3))
            list.add(ele2);
        return list;
    }
}