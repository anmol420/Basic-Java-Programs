package Numbers;

//GoldBatch Number

import java.util.*;
class goldbatch {
    static boolean even(int n) {
        if (n%2==0) {
            return true;
        } else {
            return false;
        }
    }
    static boolean odd_prime(int n) {
        int k=0,c=0;
        if (n%2!=0) {
            k++;
        }
        for (int i=1;i<=n;i++) {
            if (n%i==0) {
                c++;
            }
        }
        if (k==1 && c==2) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Be Checked");
        int n = sc.nextInt();
        if (!even(n)) {
            System.out.println("Not A Even Number");
            return;
        }
        if (n<9 || n>50) {
            System.out.println("Invalid");
            return;
        }
        System.out.println("Prime Pairs ->");
        for (int i=n;i>=1;i--) {
            for (int j=1;j<=i;j++) {
                if ((i+j)==n) {
                    if (odd_prime(i) && odd_prime(j)) {
                        System.out.println(j+","+i);
                    }
                }
            }
        }
    }
}