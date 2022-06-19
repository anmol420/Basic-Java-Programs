package Numbers;

public class lucky_series {
    public static void lucky_se(int n) {
        int a[] = new int[n];
        int c=n;

        for (int i=0;i<n;i++) {
            a[i]=i+1;
        }

        int del = 1;
        while (del<n) {
            for (int i=del;i<n;i+=del) {
                for (int j=i; j<n-1; j++) {
                    a[j]=a[j+1];
                }
                n--;
            }
            del++;
        }

        System.out.println("Lucky Numbers Till "+c+" Numbers :");
        for (int i=0;i<n;i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        lucky_se(25);
    }
}
