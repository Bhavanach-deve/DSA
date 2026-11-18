package Recursion;

public class PrintOneToN
{
    public static void print(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        print(i+1,n);
    }
    public static void printReverse(int n)
    {
        if(n==0){
            return;
        }
        System.out.println(n);
        printReverse(n-1);
    }
    public static void twoWayPrint(int i,int n)
    {
        if(i<n){
            return;
        }
        System.out.println(i);
        twoWayPrint(i-1,n);
    }
    public static void main(String[] args) {
        print(1,5);
        System.out.println("Reverse order print: ");
        printReverse(5);
        System.out.println("Reversed: " );
        twoWayPrint(5,1);

    }
}
