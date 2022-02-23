//Count The Number Of Pallindrome Words In The Sentence And Print Each Pallindrome Word

import java.util.*;
class pallindrome {
  String pallin(String st) {
    String str = "";
    int n = st.length();
    for(int i = n - 1; i >= 0; i--) {
      str = str + st.charAt(i);
    }
    return str;
  }
  void check (String st) {
    StringTokenizer str = new StringTokenizer(st);
    int k=0;
    int n = str.countTokens();
    String s[] = new String[n];
    String stk="";
    while (str.hasMoreTokens()) {
      stk = str.nextToken();
      s[k]=stk;
      k++;
    }
    int count = 0;
    String strk = "";
    for (int i=0;i<k;i++) {
      strk = pallin(s[i]);
      if (strk.equalsIgnoreCase(s[i])) {
        count++;
        System.out.println(s[i]);
      }
    }
    System.out.println("The Number Of Pallindrome Words Is - "+count);
  }
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter A Sentence");
      String st = sc.nextLine();
      /*if (!st.endsWith(".") && !st.endsWith("?")) {
        System.out.println("The Setence Must End With . or ?");
        return;
      }*/
      pallindrome ob = new pallindrome();
      ob.check(st);
    }
  }
}
