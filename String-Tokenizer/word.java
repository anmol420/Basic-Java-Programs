//Enter A Paragraph And Print The Words Present In Each Line Of The Paragraph

import java.util.*;
class sentence {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter A Paragraph");
      String s = sc.nextLine();
      StringTokenizer st = new StringTokenizer(s,".");
      String stk = "";
      while (st.hasMoreTokens()) {
        stk = st.nextToken();
        StringTokenizer str = new StringTokenizer(stk);
        System.out.println(stk+" : "+str.countTokens());
      }
    }
  }
}
