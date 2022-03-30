import java.util.*;
class Matrev {
    private int a[][],m,n;
    public Matrev(int nn,int mm) {
        m=mm;
        n=nn;
        a = new int[m][n];
    }
    public void fillarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Elements");
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }
    public int reverse(int x) {
        int rev = 0;
        while (x!=0) {
            int d=x%10;
            rev = rev*10+d;
            d/=10;
        }
        return rev;
    }
    public void revMat(Matrev P) {
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                this.a[i][j] = reverse(P.a[i][j]);
            }
        }
    }
    public void show() {
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
public class matrix {
    public static void main(String[] args) {
        Matrev obj1 = new Matrev(3,2);
        Matrev obj2 = new Matrev(3,2);
        obj1.fillarray();
        obj2.revMat(obj1);
        System.out.println("Matrix Before Reversing");
        obj1.show();
        System.out.println("Matrix After Reversing");
        obj2.show();
    }
}