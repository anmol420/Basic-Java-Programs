/*
Write a program in Java to accept a string and display the new string
after reversing the characters of each word.

Sample Input:
Understanding Computer Science

Sample output:
gnidnatsrednU retupmoC ecneicS
*/

import java.util.*;
class reverse {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter A String");
      String st = sc.nextLine();
      StringTokenizer str = new StringTokenizer(st);
      int k=0;
      String stk = "",rev="";
      int c = str.countTokens();
      String s[]=new String[c];
      while(str.hasMoreTokens()) {
        stk = str.nextToken();
        int len = stk.length();
        for (int i=len-1;i>=0;i--) {
          rev = rev + stk.charAt(i);
        }
        rev+=" ";
      }
      System.out.println("Reversed String\n"+rev);
    }
  }
}
