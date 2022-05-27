package Recursion;

//Prints The GCD

public class gcd_recursion {
    static int gcd(int x,int y) {
        if (x==y) {
            return x;
        }
        if (x>y) {
            x=x-y;
        } else {
            y=y-x;
        }
        return gcd(x,y);
    }
    public static void main(String[] args) {
        int k = gcd(12,16);
        System.out.println(k);
    }
}
