//To Convert Number To Date (Conversions Under 100)

class num_to_date {
    //supporter function
    public static boolean isLeapYear(int y) {
        if (y%400 == 0) {
            return true;
        } else if (y%100 != 0 && y%4 == 0) {
            return true;
        }
        return false;
    }
    //supporter function
    public static int numtodate(int n,int yr) {
        int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeapYear(yr)) {
            days[1] = 29;
        }
        int i,dd,mm,x;
        i=0;
        while(days[i]<n) {
            n=n-days[i];
            i++;
        }
        mm = i+1;
        dd = n;
        x = (dd*100)+mm;
        return x;
    }
    //supporter function
    public static int totdays(int yr) {
        if (isLeapYear(yr)) {
            return 366;
        }
        return 365;
    }
    //supporter function
    public static String month_to_month_name(int m) {
        String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[m-1];
    }
    //supporter function
    public static String get_suffix(int d) {
        if (d>=4 && d<=20 || d>=24 && d<=30) {
            return "th";
        }
        int x=d%10;
        if (x == 1) {
            return "st";
        } 
        if (x == 2) {
            return "nd";
        } 
        return "rd";
    }
    //Driver Function
    public static void process(int n,int yr,int N) {
        int d1,y1,m1;
        int d2,y2,m2;
        String str_m1,str_m2;
        int x = numtodate(n, yr);
        d1 = x/100;
        m1 = x%100;
        y1 = yr;
        System.out.println("Current Year ->");
        str_m1 = month_to_month_name(m1);
        String suff1 = get_suffix(d1);
        System.out.println(d1+suff1+" "+str_m1+" "+y1);
        int tot = n+N;
        if (tot <= totdays(y1)) {
            y2=y1;
        } else {
            y2=y1+1;
            tot = tot - totdays(y1);
        }
        x = numtodate(tot, y2);
        d2 = x/100;
        m2 = x%100;
        str_m2 = month_to_month_name(m2);
        System.out.println("Year After Addition ->");
        String suff2 = get_suffix(d2);
        System.out.println(d2+suff2+" "+str_m2+" "+y2);
    }
    public static void main(String[] args) {
        process(61, 2022, 50);
    }
}
