//Sample Structure Of StringTokenizer

import java.util.*;
class token {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter A String");
      String s = sc.nextLine();
      StringTokenizer st = new StringTokenizer(s);
      int count = st.countTokens();
      String stk = "";
      while (st.hasMoreTokens()) {
        stk = st.nextToken();
        System.out.println(stk);
      }
      System.out.println("Number Of Tokens : "+count);
    }
  }
}
