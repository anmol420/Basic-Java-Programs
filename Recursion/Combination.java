// Purpose: To find the combination of n and k (nCk)

import java.util.Scanner;
public class Combination {
    static int n,k;
    public Combination() {
        n=0;
        k=0;
    }
    public static void read() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = in.nextInt();
        System.out.print("Enter k: ");
        k = in.nextInt();
        if (k>n) {
            System.out.println("k must be less than or equal to n");
            System.exit(0);
        }
    }
    public static int fact(int n) {
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void compute() {
        int nfact = fact(n);
        int kfact = fact(k);
        int nkfact = fact(n-k);
        int nck = nfact/(kfact*nkfact);
        System.out.println("nCk = "+nck);
    }
    public static void display() {
        System.out.println("n = "+n);
        System.out.println("k = "+k);
  
    }
    public static void main(String[] args) {
        read();
        display();
        compute();
    }
}
