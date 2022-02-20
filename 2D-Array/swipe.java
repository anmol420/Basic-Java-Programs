//Swiping Array Rows

/*
Input -
1   2  3  4
5   6  7  8
9  10  11 12
13 14  15 16
*/

/*
Output -
16 15 14 13
9  10 11 12
5  6  7  8
1  2  3  4
*/

import java.util.*;
class swipe {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter The Number Of Rows");
      int m = sc.nextInt();
      System.out.println("Enter The Number Of Columns");
      int n = sc.nextInt();
      int a[][]=new int[n][m];
      int b[][]=new int[n][m];
      System.out.println("Enter The Elements Of Array");
      for (int i=0;i<n;i++) {
        for (int j=0;j<m;j++) {
          a[i][j]=sc.nextInt();
        }
      }
      int k=0;
      for (int j=0;j<m;j++) {
        k = n-1;
        for (int i=0;i<n;i++) {
          b[i][j]=a[k][j];
          k--;
        }
      }
      System.out.println("Array After Swiping The Elements");
      for (int i=0;i<n;i++) {
        for (int j=0;j<m;j++) {
          System.out.print(b[i][j]+"\t");
        }
        System.out.println();
      }
    }
  }
}
