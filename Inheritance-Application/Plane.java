import Numbers.prime_adam;

// super class
class Plane {
    protected int x1,y1;
    public Plane(int nx,int ny) {
        x1=nx;
        y1=ny;
    }
    public void show() {
        System.out.println("Coordinates At First End Point - ("+x1+","+y1+")");
    }
} // end of super class
// sub class 
class Circle extends Plane {
    private int x2,y2;
    private double radius,area;
    public Circle(int n1,int n2,int n3,int n4) {
        super(n1, n2);
        x2=n3;
        x2=n4;
        radius=0.0;
        area=0.0;
    }
    public void findRadius() {
        radius=Math.sqrt(Math.pow((x2-super.x1), 2)+Math.pow((y2-super.y1), 2))/2;
    }
    public void findArea() {
        area=3.14*radius*radius;
    }
    public void show() {
        super.show();
        System.out.println("Coordinates At Second End Point - (" + x2 + "," + y2 + ")");
        System.out.println("Radius Of The Circle - "+radius);
        System.out.println("Area Of The Circle - "+area);
    }
} // end of sub class
