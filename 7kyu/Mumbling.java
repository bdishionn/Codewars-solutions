// DESCRIPTION:
// This time no story, no theory. The examples below show you how to write function accum:

// Examples:
// accum("abcd") -> "A-Bb-Ccc-Dddd"
// accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
// accum("cwAt") -> "C-Ww-Aaa-Tttt"
// The parameter of accum is a string which includes only letters from a..z and A..Z.

// My Solution:

public class Accumul {
    
    public static String accum(String s) {
      
      String outcome = "";
      
      for(int i = 0; i < s.length(); i++){ // first for loop is for each char in string
      char currentChar = s.charAt(i); // current character is char at index i in string
        
       for(int j = 0; j <= i; j++){ // the 0 index would print A, the 1st index would print Aa
         if(j == 0){ // at index 0 it will print upperCase
           outcome += Character.toUpperCase(currentChar);
         } else{
           outcome += Character.toLowerCase(currentChar);
         }
       }
       outcome += "-";
     }
      return outcome.substring(0, outcome.length() - 1);
    }
}