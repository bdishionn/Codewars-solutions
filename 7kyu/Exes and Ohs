// DESCRIPTION:
// Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

// Examples input/output:

// XO("ooxx") => true
// XO("xooxx") => false
// XO("ooxXm") => true
// XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
// XO("zzoo") => false

// My Solution:

public class XO {
  
  public static boolean getXO (String str) {
    
    int countx = 0;
    int counto = 0;
    
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == 'x' || str.charAt(i) == 'X') {
        countx++;
      }
      if(str.charAt(i) == 'o' || str.charAt(i) == 'O') {
        counto++;
      }
      }
    
      if(counto == 0 && countx == 0){
        return true;
      }
      if(counto == countx){
        return true;
      } else {
        return false;
      }
    }
}