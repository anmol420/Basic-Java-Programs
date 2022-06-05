//To Convert Number To Words Under 100

class num_sring {
    public static String convert(int n) {
        String one[] = {"one","two","three","four","five","six","seven","eight","nine"};
        String sp_two[] = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String two[] = {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        if (n<10) {
            return one[n-1];
        }
        if (n%10 == 0) {
            return two[(n/10)-1];
        }
        if (n<20) {
            return sp_two[(n%10)-1];
        }
        String s1,s2;
        s1 = two[(n/10)-1];
        s2 = one[(n%10)-1];
        return s1+" "+s2;
    }
    public static void main(String args[]) {
        System.out.println(convert(15));
    }
}
