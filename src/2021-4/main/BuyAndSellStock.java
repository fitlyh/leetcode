package main;

public class BuyAndSellStock {
    public static void main(String args[])
    {
        int[] prices=new int[]{3,2,6,5,0,3};
        SolutionH solutionH=new SolutionH();
        int result=solutionH.maxProfit(prices);
        System.out.println(result);
    }
}
class SolutionH{
    public int maxProfit(int prices[]) {
        int result = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > result) {
                    result = profit;
                }
            }
        }
        return result;
    }
}
