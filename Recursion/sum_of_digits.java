package Recursion;

//Prints The Sum Of The Digits Of A Number

public class sum_of_digits {
    static int sum(int n) {
        if (n==0) {
            return 0;
        }
        return  ((n%10)+sum(n/10));
    }
    public static void main(String[] args) {
        int s = sum(248);
        System.out.println(s);
    }
}
