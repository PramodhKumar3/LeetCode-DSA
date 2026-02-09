import java.util.*;

class Solution {
    public void addList(List<Integer> list, int x){
        if(list.isEmpty() || list.get(list.size() - 1) != x)
            list.add(x);
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int i = 0, j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j])
                i++;
            else if(nums2[j] < nums1[i])
                j++;
            else{
                addList(list, nums1[i]);
                i++;
                j++;
            }
        }
        int[] ans = new int[list.size()];
        for(int k = 0; k < ans.length; k++){
            ans[k] = list.get(k);
        }
        return ans;
    }
}