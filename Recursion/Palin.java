import java.util.Scanner;

class Palin {
    static int num,revnum;
    public Palin() {
        num=0;
        revnum=0;
    }
    public static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        num=sc.nextInt();
    }
    public static int reverse(int y) {
        if (y==0) {
            return revnum;
        } else {
            revnum=revnum*10+y%10;
            return reverse(y/10);
        }
    }
    public static void check() {
        revnum = reverse(num);
        System.out.println("Original Number - "+num);
        System.out.println("Reverse Number - "+revnum);
    }
    public static void main(String[] args) {
        accept();
        check();
    }
}