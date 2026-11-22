//The stock span problem is a financial problem where we have a series of daily price quotes for a stock and we need to calculate the span of stock price for all days.
//Given an array arr[] representing daily stock prices, the stock span for the i-th day is the number of consecutive days up to day i (including day i itself) for which the price of the stock is less than or equal to the price on day i. Return the span of stock prices for each day in the given sequence.
package StacksAndQueues.Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanPreviousGreaterElements
{
   static class Pair{
        int value;
        int index;
        public Pair(int value, int index){
            this.value=value;
            this.index=index;
        }
    }

    public static ArrayList<Integer> stockSpan(int arr[])
    {
        Stack<Pair> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            while (!stack.isEmpty() && stack.peek().value <= arr[i]) {
                stack.pop();
            }
            int pge = stack.isEmpty() ? -1 : stack.peek().index;
            int span = i - pge;
            res.add(span);
            stack.push(new Pair(arr[i], i));
        }
        return res;
    }

    public static void main(String[] args)
    {
        int arr[]={7,2,1,3,3,1,8};
        System.out.println(stockSpan(arr));


    }
}
