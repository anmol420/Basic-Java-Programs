package Recursion;

//Prints The Value Of x^y

public class power {
    static int power_xy(int x,int y) {
        if (y == 0) {
            return 1;
        }
        return x*power_xy(x,y-1);
    }
    public static void main(String[] args) {
        int k = power_xy(2,3);
        System.out.println(k);
    }
}
