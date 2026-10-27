//Given an array of strings arr[]. Return the longest common prefix among each and every strings present in the array. If there's no prefix common in all the strings, return "".
package Strings.Day1;

public class LongestCommonPrefix
{
    static void main(String[] args) {
        String[]words={"fly","flying","flyer"};
        if(words.length==0){
            System.out.println("");
            return;
        }
        String prefix=words[0];

        for(int i=1;i<words.length;i++){
            while(!words[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()){
                    System.out.println("");
                    return;

                }

            }
        }
        System.out.println(prefix);
    }
}
//prefix = "flower"
//We take the first word as our initial guess. We haven't checked the other words yet.
//
//STEP 2 — Check "flow"
//"flow".startsWith("flower")
//
//
//false
//because "flow" doesn't begin with "flower".
//
//Since the result is false, the negation !false becomes true. Therefore, the while loop runs.
//We shorten the prefix:
//prefix = prefix.substring(0, prefix.length() - 1);
//
//
//"flower" → "flowe"
//Check again: "flow".startsWith("flowe") → false.
//
//Shorten again: "flowe" → "flow".
//
//Now "flow".startsWith("flow") → true.
//
//The while condition becomes !true, which is false, so the loop stops.
//
//STEP 3 — Check "flight"
//
//Our current prefix is "flow".
//"flight".startsWith("flow") → false
//Shorten the prefix one character at a time:
//"flow"
//false
//
//"flo"
//false
//
//"fl"
//true
//
//
//Now the prefix is "fl". Both "flow" and "flight" begin with "fl", so we have found the longest common prefix.