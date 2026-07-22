package ArrayProblems.Day1;
//Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
//Note: The second largest element should not be equal to the largest element.
import java.util.Arrays;

public class SecondLargest
{
    public static int getSecondLargest(int arr[])
    {
        Arrays.sort(arr);
        int largest=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=largest){
                return arr[i];
            }
        }
        return -1;

    }

    public static void main(String[] args)
    {
        int arr[]={10,10,5};
        System.out.println(getSecondLargest(arr));
    }
}
