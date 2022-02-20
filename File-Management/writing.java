//Writing Data To The File

import java.util.*;
import java.io.*;
class writing {
  public static void main(String[] args) throws IOException {
    try (Scanner sc = new Scanner(System.in)) {
      FileWriter fw = new FileWriter("details.txt");
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter pw = new PrintWriter(bw);
      char ch = 'y';
      String name,telno;
      System.out.println("Enter The Records");
      while (ch == 'y') {
        System.out.println("Enter The Name");
        name = sc.next();
        pw.write(name);
        System.out.println("Enter The Telephone Number");
        telno = sc.next();
        pw.write(telno);
        System.out.println("Continue ? (y/n)");
        ch = sc.next().charAt(0);
      }
      pw.close();
      bw.close();
      fw.close();
    }
  }
}
