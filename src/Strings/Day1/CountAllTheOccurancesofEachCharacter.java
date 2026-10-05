//Java program to count the occurrences of each character is used to find how many times every character appears in a string. It helps in understanding string manipulation and frequency counting in Java.
package Strings.Day1;

public class CountAllTheOccurancesofEachCharacter{
    public static void main(String[] args)

    {
        String s="JaiShreeRam";
        int[]c=new int[256];
        for(char ch:s.toCharArray()){
            c[ch]++;
        }
        System.out.println("Character Occurrences:");
        for(int i=0;i<c.length;i++)
        {
            if(c[i]>0)
            System.out.println((char)i+": "+c[i]);
        }

    }
}
