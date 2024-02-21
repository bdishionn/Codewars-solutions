// DESCRIPTION:
// In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

// Examples
// high_and_low("1 2 3 4 5")  # return "5 1"
// high_and_low("1 2 -3 4 5") # return "5 -3"
// high_and_low("1 9 3 4 -5") # return "9 -5"
// Notes
// All numbers are valid Int32, no need to validate them.
// There will always be at least one number in the input string.
// Output string must be two numbers separated by a single space, and highest number is first.

// My Solution:

#include <string>
#include <iostream>
#include <sstream>


std::string highAndLow(const std::string& numbers){
  
  std::stringstream ss(numbers);
  
  int num, max, min;
  
  // these two lines of code initialize max and min to first value in stringstream, which is read into our stringstream input
  ss >> num;
  max = min = num;
  
  // these lines of code will update max and min while reading the remaining numbers from the stringstream
  while(ss >> num){
    if(num > max){ // max case
      max = num;
    }
    if(num < min){ // min case
      min = num;
    }
  }
  // returns max and min (which are ints) as strings, like the function wanted us to do
  return std::to_string(max) + " " + std::to_string(min);
}