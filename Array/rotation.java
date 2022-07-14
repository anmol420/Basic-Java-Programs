/*
Rotate The Matrix 90 degree cloakwise
Find The Sum Of The Elements Of Four Corners Of The Matrix
*/

import java.util.*;
class rotation {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number Of Elements Of Array");
    int n = sc.nextInt();
    int a[][]=new int[n][n];
    System.out.println("Enter The Array The Elements");
    for (int i=0;i<n;i++) {
      for (int j=0;j<n;j++) {
        a[i][j]=sc.nextInt();
      }
    }
    System.out.println("Original Matrix");
    for (int i=0;i<n;i++) {
      for (int j=0;j<n;j++) {
        System.out.print(a[i][j]+"\t");
      }
      System.out.println();
    }
    //90 degree rotation
    int b[][]=new int[n][n];
    int k=0;
    for (int i=0;i<n;i++) {
      k=n-1;
      for (int j=0;j<n;j++) {
        b[i][j]=a[k][i];
        k--;
      }
    }
    System.out.println("Rotated Matrix");
    for (int i=0;i<n;i++) {
      for (int j=0;j<n;j++) {
        System.out.print(b[i][j]+"\t");
      }
      System.out.println();
    }
    //Sum Of Corner Elements
    int sum = a[0][0]+a[0][n-1]+a[n-1][0]+a[n-1][n-1];
    System.out.println("Sum Of Corner Elements = "+sum);
  }
}
