import java.util.*;
class OddEven {
    int a[],m;
    OddEven(int mm) {
        m=mm;
        a = new int[m];
    }
    void fillarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        for (int i=0;i<m;i++) {
            a[i] = sc.nextInt();
        }
    }
    OddEven arrange(OddEven P, OddEven Q) {
        int arr[]=new int[P.a.length+Q.a.length];
        for (int i=0;i<P.a.length;i++) {
            if (P.a[i]%2!=0) {
                arr[i]=P.a[i];
            }
        }
        for (int i=0;i<Q.a.length;i++) {
            if (Q.a[i]%2!=0) {
                arr[i]=Q.a[i];
            }
        }
        for (int i=0;i<P.a.length;i++) {
            if (P.a[i]%2==0) {
                arr[i]=P.a[i];
            }
        }
        for (int i=0;i<Q.a.length;i++) {
            if (Q.a[i]%2==0) {
                arr[i]=Q.a[i];
            }
        }
        for (int i=0;i<arr.length;i++) {
            this.a[i]=arr[i];
        }
        return this;
    }
    void display() {
        for (int i=0;i<m;i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int n = sc.nextInt();
        OddEven P = new OddEven(n);
        P.fillarray();
        System.out.println("Enter the size of the second array");
        int n1 = sc.nextInt();
        OddEven Q = new OddEven(n1);
        Q.fillarray();
        OddEven R = new OddEven(n+n1);
        R.arrange(P,Q);
        R.display();
    }
}