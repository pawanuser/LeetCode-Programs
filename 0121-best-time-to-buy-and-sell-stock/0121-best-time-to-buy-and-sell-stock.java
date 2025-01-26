class Solution {
    public int maxProfit(int[] prices) {

        int next=prices[prices.length-1], pro=0;
        for(int i=prices.length-2;i>=0;i--)
        {
            if(pro<next-prices[i])
				pro = next-prices[i];
            if(next-prices[i]<=0)
                next = prices[i];
        }
        return pro;
    }
}