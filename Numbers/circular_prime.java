package Numbers;

//Check Whether A Number Is Circular Prime Or Not.

import java.util.*;
class circular_prime {
    static boolean isprime(int n) {
        int c=0;
        for (int i=1;i<=n;i++) {
            if (n%i==0) {
                c++;
            }
        }
        if (c==2) {
            return true;
        } else {
            return false;
        }
    }
    static int digit(int n) {
        int c=0,d=0;
        while (n!=0) {
            d = n%10;
            c++;
            n/=10;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input");
        int n = sc.nextInt();
        if (!(isprime(n))) {
            System.out.println("Invalid Input");
            return;
        }
        int c = digit(n);
        int n1 = n;
        int k = 0;
        System.out.println("Output");
        for (int i=1;i<=c;i++) {
            int d = n1/(int)Math.pow(10,c-1);
            int p = n1%(int)Math.pow(10,c-1);
            n1 = p*10+d;
            if (isprime(n1)) {
                k++;
            }
            System.out.println(n1);
        }
        if (k==c) {
            System.out.println(n+" Is Circular Prime");
        } else {
            System.out.println(n+" Is Not Circular Prime");
        }
    }
}