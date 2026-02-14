import java.util.*;
// class Solution{
//     public int[] sortArray(int[] nums){
//         Arrays.sort(nums);
//         return nums;
//     }
// }

class Solution {
    // Merge Sort -> O(N log N)
    public void merge(int[] nums, int low, int mid, int high){
        int left = low, right = mid + 1;
        List<Integer> list = new ArrayList<>();
        while(left <= mid && right <= high){
            if(nums[left] <= nums[right])
                list.add(nums[left++]);
            else
                list.add(nums[right++]);
        }
        while(left <= mid)
            list.add(nums[left++]);
        while(right <= high)
            list.add(nums[right++]);
        for(int i = low; i <= high; i++)
            nums[i] = list.get(i - low);
    }

    public void mergesort(int[] nums, int low, int high){
        if(low >= high)
            return;
        int mid = (low + high) / 2;
        mergesort(nums, low, mid);
        mergesort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public int[] sortArray(int[] nums) {
        mergesort(nums, 0, nums.length - 1);
        return nums;
    }
}