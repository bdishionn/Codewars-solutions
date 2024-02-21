// DESCRIPTION:
// Given a non-empty array of integers, return the result of multiplying the values together in order. Example:

// [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

// My Solution:

public class Kata{

  public static int grow(int[] x){
    int product = 1;
    for(int mult : x){
      product *= mult;
    }
    return product;
  
  }

}