package Recursion;

public class PrintNameNTimes
{
    public static void printingNames(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println("Jai Shree Ram!");
        printingNames(i+1,n);
    }

    public static void main(String[] args) {
        printingNames(0,3);
    }
}
