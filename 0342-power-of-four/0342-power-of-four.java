class Solution {
    public boolean isPowerOfFour(int n) {
        return  n % 3 == 1 && (((n - 1) & n) == 0);
    }
}