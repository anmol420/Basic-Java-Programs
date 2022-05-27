package Recursion;

// ISC 2018 Programs

import java.util.*;
class ArmNum_rec {
    int n,l;
    public ArmNum_rec(int num) {
        n=num;
        int n1=n;
        while (n1!=0) {
            n1%=10;
            l++;
            n1/=10;
        }
    }
    public int sum_pow(int i) {
        if (i<10) {
            return (int)Math.pow(i, l);
        } else {
            return (int)Math.pow(i%10, l) + sum_pow(i/10);
        }
    }
    public void isArmstrong() {
        if (n==sum_pow(n)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int num = sc.nextInt();
        ArmNum_rec ob = new ArmNum_rec(num);
        ob.isArmstrong();
    }
}