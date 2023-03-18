// super class
class Employee {
    protected int empc;
    protected double bpay;
    public Employee() {
        empc=0;
        bpay=0;
    }
    public Employee(int c,double b) {
        empc=c;
        bpay=b;
    }
    public void Display() {
        System.out.println("Employee Code - "+empc);
        System.out.println("Employee Basic Pay - "+bpay);
    }
} // end of super class
// sub class
class Overtime extends Employee {
    private int nd;
    private float rate;
    public Overtime(int n, float f) {
        nd=n;
        rate=f;
    }
    public double Calculate() {
        return (super.bpay + (nd*rate));
    }
    public void Show() {
        Display();
        double x = Calculate();
        System.out.println("Amount Paid For Extra Days - "+(nd*rate));
        System.out.println("Employee Salary - "+x);
    }
} // end of sub class
