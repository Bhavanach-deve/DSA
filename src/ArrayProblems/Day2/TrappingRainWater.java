package ArrayProblems.Day2;

public class TrappingRainWater
{
    public static int rainWater(int arr[])
    {
        int l=0;
        int r=arr.length-1;
        int lMax=0;
        int rMax=0;
        int water=0;

        while(l<r)
        {
            if(arr[l]<arr[r]){
                if(arr[l]>=lMax){
                    lMax=arr[l];
                }
                else{
                    water=water+lMax-arr[l];
                }
                l++;
            }else{
                if(arr[r]>=rMax){
                    rMax=arr[r];
                }else{
                    water=water+rMax-arr[r];
                }
                r--;
            }
        }
        return water;
    }

    public static void main(String[] args)
    {
        int arr[]={3,0,1,0,4,0,2};
        System.out.println(rainWater(arr));
    }
}
