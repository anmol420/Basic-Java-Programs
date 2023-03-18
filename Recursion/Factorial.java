class Factorial {
    static int n,f;
    public Factorial() {
        n=0;
    }
    public static int fact(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return num*fact(num-1);
        }
    }
    public static void get(int x) {
        int f = fact(x);
        System.out.println("The Factorial Is - "+f);
    }
    public static void main(String[] args) {
        get(12);
    }
}
