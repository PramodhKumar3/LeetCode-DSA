
class Solution {
    public int reverse(int x) {
        int res = 0;
        int num = Math.abs(x);
        while(num > 0){
            int rem = num % 10;
            if(res > (Integer.MAX_VALUE - rem) / 10)
                return 0;
            if(res < (Integer.MIN_VALUE + rem) / 10)
                return 0;
            res = res * 10 + rem;
            num = num / 10;
        }
        return (x < 0) ? (-1 * res) : res;
    }
}