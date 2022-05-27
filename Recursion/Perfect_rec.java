package Recursion;

//ISC 2018 Program

import java.util.*;
class Perfect_rec {
    int num,f=1;
    public Perfect_rec(int nn) {
        num = nn;
    }
    public int sum_of_factors(int i) {
        int n=num;
        if (i>n/2) {
            return 0;
        }
        else {
            if (n%i==0) {
                return i+sum_of_factors(i+1);
            } else {
                return sum_of_factors(i+1);
            }
        }
    }
    public void check() {
        int s = sum_of_factors(1);
        if (num == s) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = sc.nextInt();
        Perfect_rec ob = new Perfect_rec(n);
        ob.check();
        int sk = ob.sum_of_factors(n);
        System.out.println(sk);
    }
}