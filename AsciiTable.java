//This program returns a table of Ascii characters

import java.util.ArrayList;

public class AsciiTable {

 public static void main(String[] args) {
  
  //Initialize a char variable
  char c = 0;
  //Create ArrayList for ascii character number reference
  ArrayList<Character> charArray = new ArrayList<Character>();
  
  //Create a for loop to append characters to the ArrayList
  for (char i = 33; i <= 126; i++) {
   charArray.add(c = i);
  }
  
  //Create a for loop for the print statement where every 10 characters will create a new line
  for (int i = 0; i <= charArray.size() - 1; i++) {
   if ((i + 1) % 10 == 0) {
    System.out.println(charArray.get(i) + " ");
   } else {
    System.out.print(charArray.get(i) + " ");
   }
  }
 }

}
