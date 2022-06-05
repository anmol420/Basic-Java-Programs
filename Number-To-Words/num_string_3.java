//To Convert Number To Words Under 100,000

class num_sring_3 {
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
        String a[] = {"thousand","hundred"};
        int c[] = {1000,100};
        String s1="";
        for (int i=0;i<2;i++) {
            int b = n/c[i];
            if (b>0) {
                String s2 = convert(b)+" "+a[i]+" ";
                s1 = s1+s2;
                if (n%c[i] == 0) {
                    return s1;
                }
                if (i==1) {
                    s1 += "and ";
                }
                n = n%c[i];
            }
        }        
        return s1+convert(n);
    }
    public static void main(String args[]) {
        System.out.println(to_words(49000));
    }
}
