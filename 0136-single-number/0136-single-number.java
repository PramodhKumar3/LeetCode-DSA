class Solution {
//  Optimal Solution
    public int singleNumber(int[] nums) {
        int XOR = 0;
        for(int num : nums)
            XOR ^= num;
        return XOR;
    }

//  Better Solutin
    // public int singleNumber(int[] nums) {
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for(int num : nums){
    //         if(!map.keySet().contains(num))
    //             map.put(num, 1);
    //         else
    //             map.put(num, map.get(num) + 1);
    //     }
    //     List<Integer> res = new ArrayList<>();
    //     for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    //         if (entry.getValue() == 1) {
    //             res.add(entry.getKey());
    //         }
    //     }
    //     return res.get(0);
    // }
}