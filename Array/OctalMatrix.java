/*
Example:
2	3	1	(decimal equivalent of 1st row = 153 i.e. 2x8^2 + 3x8^1 + 1x8^0)
4	0	5	(decimal equivalent of 2nd row = 261 i.e. 4x8^2 + 0x8^1 + 5x8^0)
1	5	6	(decimal equivalent of 3rd row = 110 i.e. 1x8^2 + 5x8^1 + 6x8^0)
*/

import java.util.*;

public class OctalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value Of m");
        int m = sc.nextInt();
        System.out.println("Enter The Value Of n");
        int n = sc.nextInt();

        if (m <= 0 || m >= 10 || n <= 2 || n >= 6) {
            System.out.println("Out Of Range");
            return;
        }

        int k=0;
        int a[][] = new int[m][n];
        System.out.println("Enter The Matrix Elements");
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j]<0 || a[i][j]>7) {
                    k++;
                }
            }
        }
        if (k>0) {
            System.out.println("Invalid Input");
            return;
        }

        int b[][] = new int[1][n];
        int c=0;
        for (int i=0;i<m;i++) {
            int dec = 0;
            int x=n;
            for (int j=0;j<n;j++) {
                dec = dec + (int)(a[i][j]*Math.pow(8,(x-1)));
                x--;
            }
            b[0][c]=dec;
            c++;
        }
        
        System.out.println("Filled Matrix"+"\t\t\t"+"Decimal Equivalent");
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\t"+b[0][c-1]);
            c--;
            System.out.println();
        }
    }
}