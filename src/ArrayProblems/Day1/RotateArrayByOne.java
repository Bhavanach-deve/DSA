//Given an array arr, rotate the array by one position in clockwise direction.
package ArrayProblems.Day1;

public class RotateArrayByOne
{
    public static void rotateBruteForce(int arr[])
    {
        int n=arr.length;
        int temp[]=new int[n];
        temp[0]=arr[n-1];
        for(int i=0;i<n-1;i++){
            temp[i+1]=arr[i];
        }
        for(int ans:temp){
            System.out.print(ans+" ");
        }

    }
    public static void rotateOptimal(int arr[])
    {
        int last=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        for(int nums:arr){
            System.out.print(nums+" ");
        }
    }

    public static void main(String[] args)
    {
        int arr[]={9,8,7,6,4,2,1,3};
        rotateBruteForce(arr);
        System.out.println();
        rotateOptimal(arr);

    }
}
