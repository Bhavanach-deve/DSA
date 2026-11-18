package Recursion;

public class BackTrackNtoOne
{
    public static void backNtoOne(int i,int n){
        if(i>n){
            return;
        }
        backNtoOne(i+1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        backNtoOne(1,3);
    }
}
