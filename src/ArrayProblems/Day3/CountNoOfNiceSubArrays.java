//We need to count all subarrays having exactly 3 odd numbers.
package ArrayProblems.Day3;

import java.util.HashMap;

public class CountNoOfNiceSubArrays
{
    public static int countNiceSubArrays(int arr[],int k)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int prefix=0;
        int count=0;
        for(int nums:arr){
            if(nums%2!=0){
                prefix++;
            }
            count+=map.getOrDefault(prefix-k,0);
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,1,1};
        int k=3;
        System.out.println(countNiceSubArrays(arr,k));
    }

}
