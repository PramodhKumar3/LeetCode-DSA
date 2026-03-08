import java.util.*;
class Solution {
    // Better Solution TC -> O(N log N)
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(!map.keySet().contains(i))
                map.put(i, 1);
            else
                map.put(i, map.get(i) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > nums.length / 3)
                list.add(entry.getKey());
        }
        return list;
    }
}