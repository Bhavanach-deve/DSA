package ArrayProblems.Day3;

public class RangeSumQueryImmutableLeetCode
{
    private int prefix[];

    public RangeSumQueryImmutableLeetCode(int arr[])
    {
        prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
    }
    public int sumRange(int left,int right)
    {
        if(left==0){
            return prefix[right];
        }
        return prefix[right]-prefix[left-1];
    }


    public static void main(String[] args)
    {
        RangeSumQueryImmutableLeetCode obj=new RangeSumQueryImmutableLeetCode(new int[]{-2,0,3,-5,2,-1});
        System.out.println(obj.sumRange(0,2));
        System.out.println(obj.sumRange(2,5));
        System.out.println(obj.sumRange(0,5));
    }
}
