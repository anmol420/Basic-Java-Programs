/*
Design  a  class  called  SumSeries   to  compute  the  summation  of the  series  :

	x/2   +    x2/4  +   x3/6  +  …………………..   for n terms
Use  the  following  members  in  your  class :
Data  members 	:	x , n , sum
Member  functions 	:	
SumSeries( )   	:    to  initialize  data  members  to 0
void input( )	:    to input  x and  n .
void  display( )	:    to   output  all  data  members
void  compute( )	:   to  calculate  the  summation

Declare an object  and  call  the  required  methods .
*/
class sumseries {
    private int x,n;
    private double sum;
    public sumseries() {
        x=0;
        n=0;
        sum=0.0;
    }
    public void input(int xx,int nn) {
        x=xx;
        n=nn;
    }
    public void display() {
        System.out.println("The Value Of x - "+x);
        System.out.println("The Value Of n - "+n);
        System.out.println("Sum Of Series - "+sum);
    }
    public void compute() {
        for (int i=1;i<=n;i++) {
            for (int j=2;j<=n;j+=2) {
                sum = ((Math.pow(x,2))/j);
            }
        }
    }
}
public class SumSeries {
    public static void main(String args[]) {
        sumseries ob = new sumseries();
        ob.input(2,5);
        ob.compute();
        ob.display();
    }
}
