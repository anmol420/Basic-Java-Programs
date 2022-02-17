// Sample Input - Computer Science
// Sample Output - C.Science

import java.util.*;
class abbreviation {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter A String");
      String s = sc.nextLine();
      StringTokenizer st = new StringTokenizer(s);
      int count = st.countTokens();
      String stk = "";
      String str[] = new String[count];
      int k = 0;
      while (st.hasMoreTokens()) {
        stk = st.nextToken();
        str[k] = stk;
        k++;
      }
      String sm = "";
      for (int i=0;i<count-1;i++) {
        String x = str[i];
        sm = sm + x.charAt(0)+"."+" ";
      }
      String ste = sm + str[count-1];
      System.out.println("Output : "+ste);
    }
  }
}
