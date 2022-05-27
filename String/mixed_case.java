package String;

/*
Write a program in Java to enter a string in a mixed case. Arrange all the
letters of string such that all the lower case characters are followed by the
upper case characters.

Sample Input:
Computer Science

Sample Output:
omputercienceCS
*/

import java.util.*;
class mixed_case {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter The String");
      String st = sc.nextLine();
      String st1 = "",st2 = "", stcon = "";
      for (int i=0;i<st.length();i++) {
        char ch = st.charAt(i);
        if (Character.isLowerCase(ch)) {
          st1=st1+ch;
        } else if (Character.isUpperCase(ch)) {
          st2=st2+ch;
        }
      }
      stcon = st1+st2;
      System.out.println("Output\n"+stcon);
    }
  }
}
