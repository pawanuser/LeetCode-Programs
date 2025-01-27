import java.util.ArrayList;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = num.length-1; i>=0; i--)
        {
            list.add(0,((num[i] + k) % 10));
            k = (num[i]+k)/10;
        }
        while(k>0)
        {
            list.add(0,k%10);
            k=k/10;
        }
        return list;
        /*int p = num.length-1, carry = 0, digit = 0, rem=0, temp = 0, sum=0;
        while(p>=0||k>0)
        {
            digit=0;
            if(p>=0)
                digit = num[p];
            rem = k%10;
            sum = carry + digit + rem;
            temp = sum%10;
            carry = sum/10;
            list.add(0,temp);
            p--; k/=10;
        }
        if(carry>0)
            list.add(0,carry);
        return list;*/
    }
}