//Given an array prices[] of non-negative integers, representing the prices of the stocks on different days. The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.
package ArrayProblems.Day4;

import static java.lang.Math.abs;

public class StockBuyAndSell
{
    public static int maxProfitStock(int arr[])
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] < minPrice) {
                minPrice = arr[i];
            }

            int profit = arr[i] - minPrice;

            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args)
    {
        int arr[]={7, 6, 4, 3, 1};
        System.out.println(maxProfitStock(arr));

    }
}
