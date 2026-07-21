//Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[].
package ArrayProblems;

import java.util.Arrays;

public class ArraySubset
{
    public static boolean isSubset(int a[],int b[])
    {
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                return false;
            }
        }
        return j==b.length;
    }

    public static void main(String[] args)
    {
        int a[]={1, 2, 3, 4, 4, 5, 6};
        int b[]={11, 3, 7, 1, 7};
        System.out.println(isSubset(a,b));

    }
}
