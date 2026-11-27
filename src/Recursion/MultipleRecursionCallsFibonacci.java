package Recursion;

public class MultipleRecursionCallsFibonacci
{
    public static int getFibonacci(int n)
    {
        if(n<=1){
            return n;
        }
        int last=getFibonacci(n-1);
        int secondLast=getFibonacci(n-2);
        return last+secondLast;
    }


    public static void main(String[] args) {

        System.out.println(getFibonacci(9));

    }
}
