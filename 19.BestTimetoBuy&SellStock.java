class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minprice=Integer.MAX_VALUE;
        int maxProfit=Integer.MIN_VALUE;

        for(int i=0;i<prices.length;i++){
            minprice=Math.min(minprice,prices[i]);
            profit=prices[i]-minprice;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
//Or
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if(profit > maxPrice){
                maxPrice = profit;
            }
        }
        return maxPrice;
    }
}
