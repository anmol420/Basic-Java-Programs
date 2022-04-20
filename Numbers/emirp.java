//Emirp Number

import java.util.*;
class emirp {
  int num = 0, rev = 0;
  void input() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter A Number");
      num = sc.nextInt();
    }
  }
  void reverse() {
    int d;
    int n = num,c=0;
    while (n!=0) {
      d = n%10;
      c++;
      n/=10;
    }
    n = num;
    c=c-1;
    while(n!=0) {
      int r = n%10;
      rev = rev + r*(int)(Math.pow(10, c));
      c--;
      n/=10;
    }
    System.out.println(rev);
  }
  boolean prime1() {
    int c=0;
    boolean check = false;
    for (int i=1;i<=num;i++) {
      if (num%i==0) {
        c++;
      }
    }
    if (c == 2) {
      check = true;
    }
    return check;
  }
  boolean prime2() {
    int c=0;
    boolean check = false;
    for (int i=1;i<=rev;i++) {
      if (rev%i==0) {
        c++;
      }
    }
    if (c == 2) {
      check = true;
    }
    return check;
  }
  public static void main(String[] args) {
    emirp ob = new emirp();
    ob.input();
    ob.reverse();
    boolean check1 = ob.prime1();
    boolean check2 = ob.prime1();
    if (check1 == true && check2 == true) {
      System.out.println("Emirp Number");
    } else {
      System.out.println("Not Emirp Number");
    }
  }
}
