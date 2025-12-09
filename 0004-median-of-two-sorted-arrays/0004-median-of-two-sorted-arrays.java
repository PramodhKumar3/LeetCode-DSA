class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] merged = new int[n+m];
        int k = 0;
        
        for(int i = 0; i < n; i++)
            merged[k++] = nums1[i];
        for(int i = 0; i < m; i++)
            merged[k++] = nums2[i];
        
        Arrays.sort(merged);
        int len = merged.length;
        // if length is odd
        if(len % 2 == 1)
            return (double) merged[len / 2];
        // if length is even
        else{
            int mid1 = merged[(len / 2) - 1];
            int mid2 = merged[len / 2];
            return ((double)mid1 + (double)mid2) / 2.0;
        }
    }
}