/*Writing In The Text File*/

import java.io.*;
import java.util.*;
class TextFileWrite {
    public static void main(String args[]) throws IOException {
        FileWriter fw = new FileWriter("StudentData.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        Scanner text = new Scanner(System.in);
        Scanner value = new Scanner(System.in);
        String str, ss;
        int rn, m1, m2, ch;
        do {
            System.out.print("\f");
            System.out.print("Enter Name::");
            str = text.nextLine();
            System.out.print("\n\n");
            System.out.print("Enter roll number::");
            rn = value.nextInt();
            System.out.print("\n\n");
            System.out.print("Enter marks in Paper 1::");
            m1 = value.nextInt();
            System.out.print("Enter marks in Paper 2::");
            m2 = value.nextInt();
            ss = str + "," + rn + "," + m1 + "," + m2 + "\n";
            bw.write(ss);
            System.out.print("Enter 1 to enter more data, 0 to quit");
            System.out.print("\nEnter choice (0/1)::");
            ch = value.nextInt();
        } while (ch == 1);
        bw.close();
        fw.close();
    }
}