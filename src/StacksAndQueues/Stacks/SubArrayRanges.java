package StacksAndQueues.Stacks;
import java.util.*;
public class SubArrayRanges
{
        public long subArrayRanges(int[] arr) {
            long maxSum = sumSubarrayMaximums(arr);
            long minSum = sumSubarrayMinimums(arr);

            return maxSum - minSum;
        }

        // Calculate sum of all subarray minimums
        public long sumSubarrayMinimums(int[] arr) {

            int n = arr.length;
            int[] pse = new int[n];
            int[] nse = new int[n];

            Stack<Integer> stack = new Stack<>();

            // Previous Smaller or Equal (PSE)
            for (int i = 0; i < n; i++) {

                while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                    stack.pop();
                }

                pse[i] = stack.isEmpty() ? -1 : stack.peek();
                stack.push(i);
            }

            stack.clear();

            // Next Strictly Smaller (NSE)
            for (int i = n - 1; i >= 0; i--) {

                while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                    stack.pop();
                }

                nse[i] = stack.isEmpty() ? n : stack.peek();
                stack.push(i);
            }

            long sum = 0;

            for (int i = 0; i < n; i++) {

                long left = i - pse[i];
                long right = nse[i] - i;

                sum += (long) arr[i] * left * right;
            }

            return sum;
        }

        // Calculate sum of all subarray maximums
        public long sumSubarrayMaximums(int[] arr) {

            int n = arr.length;
            int[] pge = new int[n];
            int[] nge = new int[n];

            Stack<Integer> stack = new Stack<>();

            // Previous Greater or Equal (PGE)
            for (int i = 0; i < n; i++) {

                while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                    stack.pop();
                }

                pge[i] = stack.isEmpty() ? -1 : stack.peek();
                stack.push(i);
            }

            stack.clear();

            // Next Strictly Greater (NGE)
            for (int i = n - 1; i >= 0; i--) {

                while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                    stack.pop();
                }

                nge[i] = stack.isEmpty() ? n : stack.peek();
                stack.push(i);
            }

            long sum = 0;

            for (int i = 0; i < n; i++) {

                long left = i - pge[i];
                long right = nge[i] - i;

                sum += (long) arr[i] * left * right;
            }

            return sum;
        }
        public static void main(String[]args){
            SubArrayRanges obj = new SubArrayRanges();
            int arr[]={1,4,3,2};
            System.out.println(obj.subArrayRanges(arr));
        }

    }
