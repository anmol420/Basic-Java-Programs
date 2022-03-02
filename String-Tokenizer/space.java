/*
While typing, a typist has created two or more consecutive blank spaces between
the words of a sentence. Write a program in Java to eliminate multiple blanks
between the words by a single blank.

Sample Input:
Indian   Cricket   team   tour   to   Australia

Sample Output:
Indian Cricket team tour to Australia
*/

import java.util.*;
class space {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter The Sentence");
      String st = sc.nextLine();
      StringTokenizer str = new StringTokenizer(st);
      String stk="",stp="";
      while (str.hasMoreTokens()) {
        stk = str.nextToken();
        stp = stp + stk + " ";
      }
      System.out.println("Ouput\n"+stp);
    }
  }
}
