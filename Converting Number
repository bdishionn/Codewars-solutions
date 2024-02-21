// DESCRIPTION:
// Convert number to reversed array of digits
// Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

// Example(Input => Output):
// 35231 => [1,3,2,5,3]
// 0 => [0]

// My solution:

public class Kata {
  public static int[] digitize(long n) {
    
    String numStr = String.valueOf(n); // converts different types of value into strings
    int revArray[] = new int[numStr.length()]; // length() method tells us how many characters are within String which holds input
    int counter = 0; // keeps track of index
    for(int i = revArray.length-1; i >= 0; i--){ // iterating backwards through the array to reverse the order of numbers
      revArray[i] = Integer.parseInt(Character.toString(numStr.charAt(counter++))); // each index in the array is converted from char to string
    } // each index that is now a string is now converted from String into an int, and the counter keeps track of the index
      return revArray;
    }
  
  }