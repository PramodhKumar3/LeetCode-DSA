import java.util.*;
// Optimal Solution for Pascal's Trianlge
class Solution {
    public List<Integer> generateRow(int row){
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add((int) ans);
        for(int i = 1; i < row; i++){
            ans = ans * (row - i);
            ans = ans / i;
            ansRow.add((int) ans);
        }
        return ansRow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 1; i <= numRows; i++)
            res.add(generateRow(i));
        return res;
    }
}
// Second Solution
// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> triangle = new ArrayList<>();
//         triangle.add(Arrays.asList(1));
//         for(int i = 1; i < numRows; i++){
//             List<Integer> row = new ArrayList<>();
//             List<Integer> prev = triangle.get(i - 1);
//             row.add(1);
//             for(int j = 1; j < i; j++){
//                 row.add(prev.get(j - 1) + prev.get(j));
//             }
//             row.add(1);
//             triangle.add(row);
//         }
//         return triangle;
//     }
// }