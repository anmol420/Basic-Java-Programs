/*DeQueue Data Structure Sample Code */

class DeQueue {
    private int a[],m,f,r;
    public DeQueue(int n) {
        m=n;
        f=0;
        r=0;
        a = new int[m];
    }
    public void add_rear(int x) {
        if (r == m) {
            System.out.println("Queue Overflow");
            return;
        }
        a[r]=x;
        System.out.println(x+" Added Successfully At Rear Position");
        r++;
    }
    public void add_front(int x) {
        if (r == m) {
            System.out.println("Queue Overflow");
            return;
        }
        for (int i=r;i>f;i--) {
            a[i]=a[i-1];
        }
        a[f]=x;
        System.out.println(x+" Added Successfully At Front Position");
        r++;
    }
    public int delete_front() {
        if (r == 0) {
            System.out.println("Queue Underflow");
            return -9999;
        }
        int temp=a[f];
        for (int i=f;i<r-1;i++) {
            a[i]=a[i+1];
        }
        r--;
        return temp;
    }
    public int delete_rear() {
        if (r == 0) {
            System.out.println("Queue Underflow");
            return -9999;
        }
        int temp=a[r-1];
        r--;
        return temp;
    }
    public void display() {
        if (r == 0) {
            System.out.println("Queue Is Empty");
            return;
        }
        System.out.println("Current Queue Elements Are -");
        for (int i=f;i<r;i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }
}
//Application Class
public class DeQueue_App {
    public static void main(String args[]) {
        int x,y;
        DeQueue ob = new DeQueue(4);
        ob.display();
        System.out.println();
        for (int i=0;i<5;i++) {
            x = (int)(11*Math.random()+10);
            y = (int)(2*Math.random()+1);
            if (y == 1) {
                System.out.println("Trying To Insert "+x+" From Front");
                ob.add_front(x);
                ob.display();
                System.out.println();
            } else {
                System.out.println("Trying To Insert "+x+" At Rear");
                ob.add_rear(x);
                ob.display();
                System.out.println();
            }
        }
        for (int i=0;i<5;i++) {
            y = (int)(2*Math.random()+1);
            if (y == 1) { 
                System.out.println("Trying To Delete Element From Front");
                x=ob.delete_front();
                if (x != -9999) {
                    System.out.println(x+" Successfully Deleted");
                }
                ob.display();
                System.out.println();
            } else {
                System.out.println("Trying To Delete Element From Rear");
                x=ob.delete_rear();
                if (x != -9999) {
                    System.out.println(x+" Successfully Deleted");
                }
                ob.display();
                System.out.println();
            }
        }
    }
}