//Print The Number Of Digits

public class count_digits {
    static int count(int n) {
        if (n == 0) {
            return 0;
        }
        return 1+count(n/10);
    }
    public static void main(String[] args) {
        int k = count(111);
        System.out.println(k);
    }
}
