/*
Create  a  class  called  Salary   with  the  following  members :
Instance variables 	:	name ,  basic pay , gross pay  &  net pay
Member methods	:	
    a) Constructor  with  parameters  to  initialize name  &  basic pay 
    b) to  display  all  instance  variables
    c) to  compute  gross  &  net  pay  as  follows :
		gross  pay  =  basic + D.A.  + H.R.A.
		net  pay     =  	Gross pay – P.F. (Provident  Fund)
		D.A        = 10%  of  basic 
		H.R.A.   =  15%  of  basic
		  P.F.	   =  8%  of  gross pay
Create  an  object  in  the  main( )  method  to  test  your  program .
*/
class salary {
    private double basic_pay,gross_pay,net_pay;
    private String name;
    public salary(String n,double basic) {
        name = n;
        basic_pay = basic;
    }
    public void display() {
        System.out.println("Name - "+name);
        System.out.println("Basic Pay - "+basic_pay);
        System.out.println("Gross Pay - "+gross_pay);
        System.out.println("Net Pay - "+net_pay);
    }
    public void compute() {
        gross_pay = basic_pay + (basic_pay*0.1) + (basic_pay*0.15);
        net_pay = gross_pay - (gross_pay*0.08);
    }
}
public class Salary {
    public static void main(String args[]) {
        salary ob = new salary("Anmol Anand",25000);
        ob.compute();
        ob.display();
    }
}
