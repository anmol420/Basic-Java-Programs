package Numbers;

//GoldBatch Number

import java.util.*;
class goldbatch {
    static boolean even(int n) { // To Check If The Number Is Even
        if (n%2==0) {
            return true;
        } else {
            return false;
        }
    } // End Of even Method
    static boolean odd_prime(int n) { // To Check If The Number Is Odd Prime
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
    } // End Of odd_prime Method
    public static void main(String[] args) { // Main Method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Be Checked");
        int n = sc.nextInt(); // Input The Number
        if (!even(n)) { // If The Number Is Not Even
            System.out.println("Not A Even Number");
            return;
        } // End Of If
        if (n<9 || n>50) { // If The Number Is Not In The Range
            System.out.println("Invalid");
            return;
        } // End Of If
        System.out.println("Prime Pairs ->");
        for (int i=1;i<=n;i++) { // Loop To Check The Prime Pairs
            for (int j=1;j<=i;j++) { // Loop To Check The Prime Pairs
                if ((i+j)==n) { // If The Sum Of The Two Numbers Is Equal To The Number
                    if (odd_prime(i) && odd_prime(j)) {
                        System.out.println(j+","+i);
                    } // End Of If
                } // End Of If
            } // End Of Inner Loop
        } // End Of Outer Loop
        System.out.println("GoldBatch Number - "+n);
    } // End Of Main Method
}  // End Of Class