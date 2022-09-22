//To Print Integers Between M To N Which Has No Digit In Common

import java.util.*;
public class unit_digit {
    private static int a[];
    private static int c;
    public static void fill(int n) {
        c=0;
        int d=0,k=0,n1=n;
        while (n!=0) {
            d=n%10;
            c++;
            n/=10;
        }
        a = new int[c];
        while (n1!=0) {
            d=n1%10;
            a[k]=d;
            n1/=10;
            k++;
        }
    }
    public static void check_unit(int n) {
        int x=0;
        for (int i=0;i<c;i++) {
            for (int j=0;j<c;j++) {
                if (i==j) {
                    continue;
                } else if (a[i]==a[j]) {
                    x++;
                }
            }
        }
        if (x==0) {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First And Last Term");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println();
        System.out.println("Unit Digit Integers Between "+m+" and "+n+":");
        for (int i=m;i<=n;i++) {
            fill(i);
            check_unit(i);
        }
    }
}
