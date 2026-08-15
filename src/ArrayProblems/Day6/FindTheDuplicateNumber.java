//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.
package ArrayProblems.Day6;


import java.util.HashMap;
import java.util.Map;

public class FindTheDuplicateNumber
{
    public static int duplicate(int arr[])
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int nums:arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>1){
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[]={1,3,4,2,2};
        System.out.println(duplicate(arr));

    }
}
