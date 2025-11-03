class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        return n % 3 == 1 and (((n - 1) & n) == 0)