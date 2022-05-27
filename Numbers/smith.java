package Numbers;

//Smith Number

import java.util.*;
public class smith {
    static int sum_digit(int n) {
        int sum = 0;
        while (n>0) {
            int d = n%10;
            sum+= d;
            n/=10;
        }
        return sum;
    }
    static int prime_fac(int n) {
        int i=2,sum=0;
        while (n>1) {
            if (n%i==0) {
                n/=i;
                sum+= sum_digit(i);
            } else {
                i++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Be Checked");
        int n = sc.nextInt();
        int k = sum_digit(n);
        int p = prime_fac(n);
        if (k==p) {
            System.out.println(n+" Is A Smith Number");
        } else {
            System.out.println(n+" Is Not A Smith Number");
        }
    }
}
