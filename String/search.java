//Search A Word In Sentence

import java.util.*;
class search {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter A Sentence");
      String sen = sc.nextLine();
      System.out.println("Enter The Word To Be Searched");
      String search = sc.next();
      sen = sen + " ";
      int k=0;
      String stri = "";
      for (int i=0;i<sen.length();i++) {
        char ch = sen.charAt(i);
        if (ch !=' ') {
          stri = stri+ch;
        } else {
          if (stri.equalsIgnoreCase(search)) {
            k = 1;
            break;
          }
          stri = "";
        }
      }
      if (k == 1) {
        System.out.println("Word Found");
      } else {
        System.out.println("Word Not Found");
      }
    }
  }
}
