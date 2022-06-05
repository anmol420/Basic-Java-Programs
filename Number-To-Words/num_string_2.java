//To Convert Number To Words Under 1000

class num_sring_2 {
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
    public static String to_words(int n) {
        if (n==0) {
            return "zero";
        }
        String s1="";
        int b;
        b=n/100;
        if (b>0) {
            String s2 = convert(b)+" hundred ";
            s1 = s1+s2;
            if (n%100 == 0) {
                return s1;
            }
            s1 += "and ";
            n = n%100;
        }
        return s1+convert(n);
    }
    public static void main(String args[]) {
        System.out.println(to_words(0));
    }
}
    