/*Read Data From Text File*/

import java.util.*;
import java.io.*;

class TextFileRead {
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("StudentData.txt");
        BufferedReader br = new BufferedReader(fr);
        String str, name, roll, s1, s2;
        StringTokenizer obj;
        int x1, x2, tot;
        while (true) {
            str = br.readLine();
            if (str == null) {
                break;
            }
            obj = new StringTokenizer(str, ",");
            name = obj.nextToken();
            roll = obj.nextToken();
            s1 = obj.nextToken();
            s2 = obj.nextToken();
            x1 = Integer.parseInt(s1);
            x2 = Integer.parseInt(s1);
            tot = x1 + x2;
            System.out.print("Name::" + name + "\t");
            System.out.print("Roll no::" + roll + "\t");
            System.out.print("marks :" + x1 + "," + x2 + "\n");
            System.out.print("Total marks :" + tot + "\n\n\n");
        }
        br.close();
        fr.close();
    }
}