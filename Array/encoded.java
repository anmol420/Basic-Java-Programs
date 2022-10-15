//To encode the no. to words

import java.util.*;
class encoded {
    int a[]; //array to store the no.
    String b[]; //array to store the words
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        int n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] <0 || a[i]>26) {
                System.out.println("Invalid Input !! The Number Should Be Between 1 And 26");
                return;
            }
        }
    }
    public void encode() {
        b = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = "";
            int n = a[i];
            while (n > 0) {
                int r = n % 10;
                b[i] = (char) (r + 64) + b[i];
                n = n / 10;
            }
            if (a[i]==0)
                b[i] = " ";
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
    public static void main(String[] args) {
        encoded obj = new encoded();
        obj.accept();
        obj.encode();
    }
}