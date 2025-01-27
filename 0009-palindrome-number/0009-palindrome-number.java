class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int num=0;
        int x2 = x;
        while(x!=0)
        {
            num = num*10+x%10;
            x/=10;
        }
        return num==x2;
    }
}