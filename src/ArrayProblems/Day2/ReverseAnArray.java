//You are given an array of integers arr[]. You have to reverse the given array.
package ArrayProblems.Day2;

public class ReverseAnArray
{
    public static void reverseArray(int arr[])
    {
        int n=arr.length-1;
        int i=0;
        int j=n;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        for(int nums:arr){
            System.out.print(nums+" ");
        }
    }


    public static void main(String[] args)
    {
        int arr[]={1,4,3,2,6,5};
        reverseArray(arr);

    }

}
