package Numbers;

// Lucky Number

import java.util.*;
class lucky {
    public static int c=2;
    public static boolean lucky_number(int n) {
        if (c > n) {
            return true;
        }
        if (n%c == 0) {
            return false;
        }
        int n1 = n - (n/c);
        c++;
        return lucky_number(n1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value Of N");
        int n = sc.nextInt();
        if (lucky_number(n)) {
            System.out.println("A Lucky Number");
        } else {
            System.out.println("Not A Lucky Number");
        }
        System.out.println();
    }
}
 
