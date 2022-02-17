//To Print Number Of Vowels Present In The String

import java.util.*;
class vowel {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter A String");
      String s = sc.nextLine();
      StringTokenizer st = new StringTokenizer(s);
      String stk = "";
      int c=0;
      char ch;
      while (st.hasMoreTokens()) {
        stk = st.nextToken();
        stk = stk.toLowerCase();
        for (int i=0;i<stk.length();i++) {
          ch = stk.charAt(i);
          if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
            c=c+1;
          }
        }
      }
      System.out.println("Number Of Vowels In The String Is : "+c);
    }
  }
}
