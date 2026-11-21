package Recursion;

public class Functions {
    //sum of 1st n numbers using parameters
    public static void sumOfnum(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sumOfnum(i-1,sum+i);
    }
    //sum of 1st n numbers using functions return-type
    public static int sumReturn(int n)
    {
        if(n==0){
            return 0;
        }
        return n+sumReturn(n-1);
    }
    //factorial
    public static int factorial(int n)
    {
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        sumOfnum(3,0);
        System.out.println();
        System.out.println(sumReturn(3));
        System.out.println();
        int n=5;
        System.out.println("Factorial of "+n+":"+factorial(n));
    }
}
