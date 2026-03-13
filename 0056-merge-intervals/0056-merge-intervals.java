import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < intervals.length; i++){
            int last = list.size() - 1;
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(list.isEmpty() || list.get(last)[1] < start)
                list.add(new int[]{start, end});
            else{
                int[] Last = list.get(last);
                Last[1] = Math.max(Last[1], end);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}