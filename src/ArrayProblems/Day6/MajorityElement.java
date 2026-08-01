//Given an array arr[] of size n, find the element that appears more than ⌊n/2⌋ times. If no such element exists, return -1.
package ArrayProblems.Day6;

public class MajorityElement
{
    public static int majorityElement(int arr[])
    {
        int count=0;
        int n=arr.length;
        int candidate=-1;
        for(int i=0;i<n;i++){
            if(count==0){
                candidate=arr[i];
                count=1;
            }
            else if(arr[i]==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        count=0;
        for(int nums:arr){
            if(nums==candidate){
                count++;
            }
        }
        if(count>n/2)
            return candidate;
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[]={1,1,2,1,3,5,1};
        System.out.println(majorityElement(arr));

    }
}
