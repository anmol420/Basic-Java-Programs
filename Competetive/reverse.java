package Competetive;

/*
https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/terrible-chandu/
*/

import java.util.*;
class reverse {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter The Number Of Inputs");
      int n = sc.nextInt();
      String s[] = new String[n];
      System.out.println("Enter The Strings");
      for (int i=0;i<n;i++) {
        s[i]=sc.next();
      }
      String stk="",rev="";
      for (int i=0;i<n;i++) {
        stk = s[i];
        int len = stk.length();
        for (int j=len-1;j>=0;j--) {
          rev = rev + stk.charAt(j);
        }
        System.out.println(rev);
        rev = "";
      }
    }
  }
}
