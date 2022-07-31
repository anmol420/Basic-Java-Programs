/*To Transpose A Matrix Without Using Another Matrix*/

import java.util.*;
public class transpose {
    public static void display(int a[][]) {
        int m = a.length; //no. of rows
        int n = a[0].length; // no. of columns
        
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void transpose_mat(int a[][]) {
        int m = a.length; //no. of rows
        int n = a[0].length; // no. of columns
        
        for (int i=0;i<m-1;i++) {
            for (int j=i+1;j<n;j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int a[][] = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
                };
        
        display(a);
        transpose_mat(a);
        System.out.print("\n");
        display(a);
    }
}