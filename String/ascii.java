/*  Write a program in Java to enter the string. Count and display:

    The character with lowest ASCII code in lower case
    The character with highest ASCII code in lower case
    The character with lowest ASCII code in upper case
    The character with highest ASCII code in upper case

    Sample Output:

    The character with lowest ASCII code in lower case: a
    The character with highest ASCII code in lower case: y
    The character with lowest ASCII code in upper case: E
    The character with highest ASCII code in upper case: P  */

import java.util.*;
class ascii {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter A String (Sentence)");
      String st = sc.nextLine();
      char ll = 255;
      char hl = 0;
      char lu = 255;
      char hu = 0;

      for (int i=0;i<st.length();i++) {
        char ch = st.charAt(i);
        if (Character.isLowerCase(ch)) {
          if (ch < ll) {
            ll = ch;
          } else if (ch > hl) {
            hl = ch;
          }
        }
        else if (Character.isUpperCase(ch)) {
          if (ch < lu) {
            lu = ch;
          } else if (ch > hu) {
            hu = ch;
          }
        }
      }
      System.out.println("The character with lowest ASCII code in lower case:"+ll);
      System.out.println("The character with highest ASCII code in lower case:"+hl);
      System.out.println("The character with lowest ASCII code in upper case:"+lu);
      System.out.println("The character with highest ASCII code in upper case:"+hu);
    }
  }
}
