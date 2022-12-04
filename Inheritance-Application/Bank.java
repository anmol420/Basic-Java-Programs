import java.util.*;
class Bank {
    protected String name;
    protected long acc_no;
    protected double bal;
    public Bank(String n,long a,double b) {
        name = n;
        acc_no = a;
        bal = b;
    }
    public void display() {
        System.out.println("Name: "+name);
        System.out.println("Account number: "+acc_no);
        System.out.println("Balance: "+bal);
    }
}
class Interest extends Bank {
    private double rate, time;
    public Interest(String n,long a,double b,double r,double t) {
        super(n,a,b);
        rate = r;
        time = t;
    }
    public double calculate() {
        return bal * Math.pow((1 + rate / 100), time) - bal;
    }
    public void display() {
        super.display();
        System.out.println("Rate of interest: "+rate);
        System.out.println("Time: "+time);
        double ci = calculate();
        System.out.println("Compound interest: "+ci);
    }
}