/*
Design  a  class  called  HotelBill  with  the  following  specifications  :
Data  members :
Customer name (String) , Days  of stay (integer) ,  Accommodation type (character) ,  Bill  amount (double)
Member  functions 	:	
    a) to  accept  data  member  values
    b) to  display  all  data  member values
    c) to  compute  the  bill  amount 
	The  bill  amount  is  calculated  according  to    Accommodation  type in  the  following  manner :
	Accommodation type	      Charge per day
	  Ordinary (‘O’)		     Rs.    825
     	      Deluxe (‘D’) 		    Rs  1450 	
    Super Deluxe (‘S’)		    Rs	 2500	

A   10%  Service tax  is added  to  the  bill  amount .

In  the  main  method( ) , declare  as  object  of  the  above  class  and  invoke  the  necessary  functions . 
*/
class hotelbill {
    private String name;
    private int days;
    private char type;
    private double bill;
    public void accept(String n,char t,int d) {
        name = n;
        days = d;
        type = t;
    }
    public void display() {
        System.out.println("Customer Details");
        System.out.println("Name - "+name);
        System.out.println("Days Of Stay - "+days);
        System.out.println("Accomodation Type - "+type);
        System.out.println("\nBill");
        System.out.println("Amount To Be Paid - "+bill);
    }
    public void compute() {
        if (type == 'O')
        {
            bill = (825*days)+(825*days*0.1);
        }
        if (type == 'D')
        {
            bill = (1450*days)+(1450*days*0.1);
        }
        if (type == 'S')
        {
            bill = (2500*days)+(2500*days*0.1);
        }
    }
}
public class HotelBill {
    public static void main(String args[]) {
        hotelbill ob = new hotelbill();
        ob.accept("Anmol Anand",'D',5);
        ob.compute();
        ob.display();
    }
}
