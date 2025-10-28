class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        
        int temp = x, rev = 0, rem = 0;
        while(temp != 0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        if(rev == x)
            return true;
        return false;
    }
}