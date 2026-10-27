//Determine whether two strings contain the same characters with the same frequencies.
//Input: "listen", "silent"
package Strings.Day1;

import java.util.Scanner;

public class Anagram
{
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st String:");
        String s1=sc.nextLine();
        System.out.println("Enter the 2nd String:");
        String s2=sc.nextLine();
        if(s1.length()!=s2.length())
        {
            System.out.println("The provided strings is not an Anagram");
        }
        int freq[]=new int[26];

        for(int i=0;i<s1.length();i++)
        {
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;

        }
        boolean isAnagram=true;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                isAnagram=false;
                break;
            }
        }
        System.out.println(isAnagram ? "Provided strings are Anagrams" : "Not Anagrams");

    }
}
