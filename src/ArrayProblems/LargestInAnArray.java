//Given an array arr[]. The task is to find the largest element and return it.
package ArrayProblems;

public class LargestInAnArray
{
    public static int largestelement(int arr[])
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int arr[]={1,8,7,56,90};
        System.out.println(largestelement(arr));

    }
}
