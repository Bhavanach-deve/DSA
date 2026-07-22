//Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.
package ArrayProblems.Day1;

public class CheckIfAnArrayIsSorted
{
    public static boolean isSorted(int arr[])
    {
        int i=0;
        for(i=1;i<arr.length;){
            if(arr[i]>arr[i-1]||arr[i]==arr[i-1]){
                i++;
            }
            else{
                return false;
            }
        }
        return i==arr.length;
    }

    public static void main(String[] args)
    {
        int arr[]={10,20,30,40,50};
        System.out.println(isSorted(arr));

    }
}
