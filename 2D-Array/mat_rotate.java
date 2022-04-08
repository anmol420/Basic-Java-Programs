//ignore this line
package com.company;

/* Check ISC 2016 Question */
import java.util.*;
public class rotation {
    int[][] a;
    int m;
    public static boolean check(int m) {
        if (m>3 && m<10) {
            return true;
        } else {
            return false;
        }
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Elements Of The Array");
        m = sc.nextInt();
        if (!(check(m))) {
            System.out.println("Out Of Range !!");
            return;
        }
        a = new int[m][m];
        System.out.println("Enter The Number Of Elements");
        for (int i=0;i<m;i++) {
            for (int j=0;j<m;j++) {
                if ((a[i][j] = sc.nextInt())<0) {
                    System.out.println("Less Than 1 Not Allowed !!");
                    return;
                }
            }
        }
    }
    public void calc() {
        int s = 0;
        int k = 0;
        for (int i=1;i<m-1;i++) {
            for (int j=1;j<m-1;j++) {
                s++;
            }
        }
        int[] b = new int[s];
        for (int i=1;i<m-1;i++) {
            for (int j=1;j<m-1;j++) {
                b[k] = a[i][j];
                k++;
            }
        }
        int t=0;
        for (int i=0;i<s;i++) {
            for (int j=i+1;j<s;j++) {
                if (b[i]>b[j]) {
                    t = b[j];
                    b[j]=b[i];
                    b[i]=t;
                }
            }
            t=0;
        }
        k=0;
        for (int i=1;i<m-1;i++) {
            for (int j=1;j<m-1;j++) {
                a[i][j]=b[k];
                k++;
            }
        }
    }
    public void display() {
        for (int i=0;i<m;i++) {
            for (int j=0;j<m;j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public void diagonal() {
        int sum=0;
        System.out.println("Diagonal Elements");
        for (int i=0;i<m;i++) {
            for (int j=0;j<m;j++) {
                if ((i==j)||(i+j)==(m-1)) {
                    sum = sum + a[i][j];
                    System.out.print(a[i][j]+"\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
        System.out.println("Sum Of Diagonal Elements = "+sum);
    }
    public static void main(String[] args) {
        rotation ob = new rotation();
        ob.input();
        System.out.println("Original Matrix");
        ob.display();
        ob.calc();
        System.out.println("Rearranged Matrix");
        ob.display();
        ob.diagonal();
    }
}
