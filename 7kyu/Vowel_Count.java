// DESCRIPTION:
// Return the number (count) of vowels in the given string.

// We will consider a, e, i, o, u as vowels for this Kata (but not y).

// The input string will only consist of lower case letters and/or spaces.

// My Solution:

public class Vowels {

  public static int getCount(String str) {
    
    int count = 0; // increments by one when there is a vowel within the string
    String word = str; // create a new variable for the str input
    
    for (int i = 0; i < str.length(); i++) { // for loop to iterate through the length of the string
      if(word.charAt(i) == 'a' || word.charAt(i) == 'e' // if any of the inputs match the character at the index, increment count
      || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
        count++;
    }
    return count;
  }

}