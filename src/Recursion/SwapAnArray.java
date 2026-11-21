package Recursion;

class ReverseReducingTime{
    public static void reversed(int arr[],int i){
        int n=arr.length;
        if(i>=n/2){
            return;
        }
        swap(arr,i,n-i-1);
        reversed(arr,i+1);
    }
    public static void swap(int arr[],int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}

public class SwapAnArray
{
    public static void reverse(int arr[],int l, int r){
        if(l>=r){
            return;
        }
        swap(arr,l,r);
        reverse(arr,l+1,r-1);

    }
    public static void swap(int arr[],int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }

    public static void main(String[] args)
    {
        int arr[]={1,3,2,5,4};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reveresed");
        int arr1[]={1,2,3,4,5};
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        ReverseReducingTime.reversed(arr1,0);
        System.out.println();
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }


    }
}
