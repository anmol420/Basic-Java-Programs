//Game Of Life Program

import java.util.*;

class game_of_life {

    static void fill(int a[][]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int)(2*Math.random());
            }
        }
    }

    static int count_living(int a[][],int i,int j) {
        int n=a.length;
        int c=0;
        for (int x=i-1;x<(i+2);x++) {
            if (x<0 || x==n) {
                continue;
            }
            for (int y=j-1;y<(j+2);y++) {
                if (y<0 || y==n) {
                    continue;
                }

                if (x==i && y==j) {
                    continue;
                }

                if (a[x][y]==1) {
                    c++;
                }
            }
        }
        return c;
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
        int n=4;
        int a[][]=new int[n][n];
        
        fill(a);
        display(a);
        System.out.println();
        System.out.println(count_living(a, 0, 0));
        System.out.println(count_living(a, 2, 3));
        System.out.println(count_living(a, 2, 2));
    }
}