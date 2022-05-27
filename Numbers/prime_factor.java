package Numbers;

//Prime Factorisation

import java.util.*;
public class prime_factor {
    static void prime_fac(int n) {
        int m = 1,n1 = n;
        System.out.print("Prime Factors Of "+n+"\n"+n+" - ");
        for (int i=2;i<=n;i++) {
            if (m == n) {
                break;
            } else {
                while (n1%i==0) {
                    m*=i;
                    n1/=i;
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Be Checked");
        int n = sc.nextInt();
        prime_fac(n);
    }
}
