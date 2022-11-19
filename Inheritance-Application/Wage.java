//super class
class Worker {
    protected String Name;
    protected double Basic;
    public Worker(String n,double b) {
        Name=n;
        Basic=b;
    }
    public void display() {
        System.out.println("Name Of The Worker "+Name);
        System.out.println("Basic Pay Of The Worker "+Basic);
    }
}
//sub class
class Wages extends Worker {
    private double hrs,rate,wage;
    public Wages(String a,double x,double hr,double r) {
        super(a,x);
        hrs=hr;
        rate=r;
        wage=0;
    }
    public double overtime() {
        return (hrs*rate);
    }
    public void display() {
        wage=overtime()+Basic;
        super.display();
        System.out.println("Wage Of The Worker "+wage);
    }
}
