package Strings.Day2;
//Reverse the order of words, remove leading/trailing spaces, and reduce multiple spaces between words to one.
//s.trim()
//
//The trim() method removes any leading and trailing whitespace from the string s.
//Example: " hello world ".trim() becomes "hello world".
//split("\\s+")
//
//The split() method divides a string into an array of substrings based on a regular expression.
//\\s is a regex pattern that matches any whitespace character, including spaces, tabs, and newlines.
//The + quantifier means one or more occurrences of the preceding pattern.
//Therefore, \\s+ matches one or more consecutive whitespace characters, ensuring that multiple spaces between words do not produce empty strings in the array
class ReverseWords{
    public static String reverseWords(String s){
        String []words= s.trim().split("\\s+");s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            result.append(words[i]);

            if(i>0){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
public class ReverseWordsInAString
{
    static void main(String[] args)
    {
        String s="Java coding";
        String ans=ReverseWords.reverseWords(s);
        System.out.println(ans);


    }
}
