// super class
class Product {
    protected String name;
    protected int code;
    protected double amount;
    public Product(String n, int c, double p) {
        name=n;
        code=c;
        amount=p;
    }
    public void show() {
        System.out.println("Product Name - "+name);
        System.out.println("Product Code - "+code);
        System.out.println("Prouct Price - "+amount);
    }
} // end of super class
// sub class
class Sales extends Product {
    private int Day;
    private double tax,totamt;
    public Sales(String a,int b,double c,int d) {
        super(a,b,c);
        Day=d;
        tax=0.0;
        totamt=0.0;
    }
    public void compute() {
        double fine=0.0;
        if (Day>30) {
            fine=(2.5/100)*super.amount;
        }
        tax=(12.4/100)*super.amount;
        totamt=super.amount+tax+fine;
    }
    public void show() {
        super.show();
        System.out.println("Days Taken To Pay The Amount - "+Day);
        System.out.println("Total Tax To Be Paid - "+tax);
        System.out.println("Total Amount To Be Paid - "+totamt);
    }
} // end of sub class
