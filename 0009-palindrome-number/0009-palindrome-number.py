class Solution:
    def isPalindrome(self, x):
        if(x < 0):
            return False
        else:
            temp = x
            rev = 0
            rem = 0
            while(temp != 0):
                rem = temp % 10
                rev = rev * 10 + rem
                temp /= 10

            if(rev == x):
                return True
            return False