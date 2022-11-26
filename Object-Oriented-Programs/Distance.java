import java.util.*;
class Distance {
    int ft,in;
    public Distance() {
        ft=0;in=0;
    }
    public Distance(int x,int y) {
        ft=x;in=y;
    }
    public void showDist() {
        System.out.println("The Distance Is: "+ft+"feet "+in+"inch.");
    }
    public Distance diff(Distance d) {
        this.in=this.ft*12+this.in;
        d.in=d.ft*12+d.in;
        int dif=this.in-d.in;
        int x=dif%12;
        dif/=12;
        this.in=x;
        this.ft=dif;
        return d;
    }
    public static void main (String[] args) {
        Distance ob1 = new Distance(4,9);
        Distance ob2 = new Distance(7,3);
        System.out.println("For Distance 1");
        ob1.showDist();
        System.out.println("For Distance 2");
        ob2.showDist();
        ob2.diff(ob1);
        System.out.println("Difference In Distance";)
        ob2.showDist();
    }
}