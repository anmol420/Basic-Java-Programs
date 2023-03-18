class Disarium {
    static int num,size;
    public Disarium(int nn) {
        num=nn;
        size=0;
    }
    public static void countdigit() {
        int n=num;
        while (n!=0) {
            int d=n%10;
            size++;
            n/=10;
        }
    }
    public static int sumofdigits(int n,int p) {
        int d,sum=0;
        for (int i=p-1;i>=0;i--) {
            d=n/(int)(Math.pow(10,i));
            sum=sum+(int)(Math.pow(d, p-i));
            n%=(int)(Math.pow(10,i));
        }
        return sum;
    }
    public static void check() {
        if (sumofdigits(num, size)==num) {
            System.out.println("Disarium Number");
        } else {
            System.out.println("Not Disarium Number");
        }
    }
    public static void main(String[] args) {
        Disarium ob = new Disarium(135);
        countdigit();
        check();
    }
}