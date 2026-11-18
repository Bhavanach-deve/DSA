package Recursion;

public class BackTrackPrintOneToN
{
    public static void backTrack(int i,int n){
        if(i<n){
            return;
        }
        backTrack(i-1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        backTrack(10,1);

    }
}
