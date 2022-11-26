import java.util.*;
class Set {
    int a[],n;
    public Set(int nn) {
        n=nn;
        a=new int[n];
    }
    public void readElements() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Elements Of Set In Ascending Order Only Without Repetition");
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
    }
    public void display() {
        System.out.println("Elements Of The Set-");
        for (int i=0;i<n;i++) {
            System.out.print("{ ");
            System.out.print(a[i]);
            System.out.println(" }");
        }
        System.out.println();
    }
    public int has(int ele) {
        for (int i=0;i<n;i++) {
            if (a[i]==ele) {
                return 1;
            }
        }
        return 0;
    }
    public Set intersection(Set d) {
        for (int i=0;i<this.n;i++) {
            for (int j=0;j<d.n;j++) {
                if (this.a[i]==d.a[j]) {
                    System.out.println(d.a[j]);
                }
            }
        }
        return d;
    }
    public static void main (String[] args) {
        Set ob1 = new Set(4);
        Set ob2 = new Set(5);
        ob1.readElements();
        ob2.readElements();
        System.out.println("Set 1-");
        ob1.display();
        System.out.println("Set 2-");
        ob2.display();
        System.out.println("Intersection Elements");
        ob2.intersection(ob1);
    }
}