package Numbers;

import java.util.*;

class pronic {
    int num;

    pronic() {
        num = 0;
    }

    void acceptnum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
    }

    boolean ispronic(int v) {
        for (int i = 0;i <= (int)(Math.sqrt(v));i++)
            if (v == i * (i + 1))
                return true;
    return false;
    }

    void check() {
        if (ispronic(num)) {
            System.out.println("The number is pronic");
        } else {
            System.out.println("The number is not pronic");
        }
    }

    public static void main(String args[]) {
        pronic obj = new pronic();
        obj.acceptnum();
        obj.check();
    }
}