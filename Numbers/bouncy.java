// Bouncy Number

import java.util.*;
public class bouncy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i = 0;
        while (count < n) {
            i++;
            if (isBouncy(i)) {
                count++;
            }
        }
        System.out.println(i);
    }

    public static boolean isBouncy(int n) {
        boolean increasing = false;
        boolean decreasing = false;
        int lastDigit = n % 10;
        n /= 10;
        while (n > 0) {
            int digit = n % 10;
            if (digit > lastDigit) {
                increasing = true;
            } else if (digit < lastDigit) {
                decreasing = true;
            }
            if (increasing && decreasing) {
                return true;
            }
            lastDigit = digit;
            n /= 10;
        }
        return false;
    }
}