class Solution {
    public int majorityElement(int[] nums) {
    // Sorting Solution
    /*
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    */
    // Solution using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(!map.keySet().contains(num))
                map.put(num, 1);
            else
                map.put(num, map.get(num) + 1);
        }
        int n = (nums.length) / 2;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > n)
                return entry.getKey();
        }
        return 0;
    }
}