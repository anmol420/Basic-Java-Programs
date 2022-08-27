//Magic Square

import java.util.*;

class magic_square {
    static boolean is_odd(int z) {
        if (z % 2 != 0) {
            return true;
        }
        return false;
    }

    static void fill_square(int a[][]) {
        int n = a.length;
        int i = 0;
        int j = n/2;
        int num = 1;
        while (num <= n * n) {
            a[i][j] = num++;
            i--;
            j++;
            if (i<0 && j<n) {
                i = n-1;
            } else if (i>=0 && j==n) {
                j=0;
            } else if (i<0 && j==n) {
                i+=2;
                j--;
            } else if (a[i][j]>0) {
                i+=2;
                j--;
            } else {
                continue; //valid + unoccupied
            }
        }
    }

    static void display(int a[][]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d   ",a[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of The Matrix ?\t");
        int y = sc.nextInt();
        System.out.println();

        if (!is_odd(y)) {
            System.out.println("Invalid Input");
            return;
        }

        int a[][] = new int[y][y];
        fill_square(a);
        display(a);
    }
}