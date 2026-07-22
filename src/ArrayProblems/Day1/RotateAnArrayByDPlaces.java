//Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.
package ArrayProblems.Day1;

import java.util.Arrays;

public class RotateAnArrayByDPlaces
{
    public static void rotateArrBrute(int arr[],int d) {
        int n = arr.length;
        while (d > 0) {
            int first = arr[0];

            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first;
            d--;
        }
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }

    public static void reverse(int arr[],int start,int end)
    {
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

    }
    public static void rotateArrOptimal(int[]arr,int d)
    {
        int n=arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

        for(int nums:arr){
            System.out.print(nums+" ");
        }

    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        int d=2;
        rotateArrBrute(arr,d);
        System.out.println();
        int arr1[]={2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        rotateArrOptimal(arr1,2);

    }

}
