package ArrayProblems.Day2;

import java.util.Arrays;

public class MergeSortedArrays
{
    public static void merge(int a[],int b[])
    {
        int i=0;
        int j=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]>b[j]){
                int temp=b[j];
                b[j]=a[i];
                a[i]=temp;
            }
            i++;
            Arrays.sort(b);
        }
        for(int n:a){
            System.out.print(n+" ");
        }
        System.out.println();
        for(int m:b){
            System.out.print(m+" ");
        }
    }
    public static void mergeArraysOptimal(int a[], int b[])
    {
        int n = a.length;
        int m = b.length;

        for(int i = 0; i < n; i++)
        {
            if(a[i] > b[0])
            {
                // Swap
                int temp = a[i];
                a[i] = b[0];
                b[0] = temp;

                // Move b[0] to its correct position
                int first = b[0];
                int k = 1;

                while(k < m && b[k] < first)
                {
                    b[k - 1] = b[k];
                    k++;
                }

                b[k - 1] = first;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

   public static void main(String[] args)
   {
       int a[]={1, 5, 9, 10, 15, 20};
       int b[]={2,3,8,13};
       merge(a,b);
       System.out.println();
       System.out.println("------------------");
       mergeArraysOptimal(a,b);

    }
}
