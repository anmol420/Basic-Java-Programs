package Numbers;

//Prints The GCD

import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Two Numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        while (x!=y) {
            if (x>y) {
                x=x-y;
            } else {
                y=y-x;
            }
        }
        System.out.println(x);
    }
}
