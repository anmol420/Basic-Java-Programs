// super class
class Stock {
    protected String item;
    protected double qty,rate,amt;
    public Stock(String a,double b,double c) {
        item=a;
        qty=b;
        rate=c;
        amt=qty*rate;
    }
    public void display() {
        System.out.println("Name Of Item "+item);
        System.out.println("Quantity "+qty);
        System.out.println("Rate "+rate);
        System.out.println("Amount Is "+amt);
    }
}
// sub class
class Purchase extends Stock {
    private int pqty;
    private double prate;
    public Purchase(String a,double b,double c,int d,double e) {
        super(a,b,c);
        pqty=d;
        prate=e;
    }
    public void update() {
        qty+=pqty;
        if (prate!=rate) {
            rate=prate;
        }
        amt=qty*rate;
    }
    public void display() {
        super.display();
        update();
        super.display();
    }
}