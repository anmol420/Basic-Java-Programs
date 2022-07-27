//Check ISC 2018 Question

import java.util.*;
class sort {
    static boolean valid(int m,int n) {
        if (m>2 && m<10 || n>2 && n<10) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Value Of M");
            int m = sc.nextInt();
            System.out.println("Enter The Value Of N");
            int n = sc.nextInt();
            if (!valid(m, n)) {
                System.out.println("Not Valid");
                return;
            }
            int a[][] = new int[m][n];
            System.out.println("Enter The Elements Of Array");
            for (int i=0;i<m;i++) {
                for (int j=0;j<n;j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Original Matrix");
            for (int i=0;i<m;i++) {
                for (int j=0;j<n;j++) {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
            int t=0;
            for (int i=0;i<m;i++) {
                for (int j=0;j<n-1;j++) {
                    for (int k=0;k<(n-1-j);k++) {
                        if (a[i][k]>a[i][k+1]) {
                            t = a[i][k];
                            a[i][k]=a[i][k+1];
                            a[i][k+1]=t;
                        }
                    }
                }
            }
            System.out.println("Array After Sorting");
            for (int i=0;i<m;i++) {
                for (int j=0;j<n;j++) {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
}