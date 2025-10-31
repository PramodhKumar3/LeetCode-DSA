class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> m1 = new HashMap<>();
        for(int num : nums){
            if(!m1.keySet().contains(num))
                m1.put(num, 1);
            else
                m1.put(num, m1.get(num) + 1);
        }
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : m1.entrySet()) {
            if (entry.getValue() == 2) {
                res.add(entry.getKey());
            }
        }
        return new int[]{res.get(0), res.get(1)};
    }
}