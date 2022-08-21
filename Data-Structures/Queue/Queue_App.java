/*Queue Data Structure Sample Code */

class Queue {
    private int a[],m,f,r;
    public Queue(int n) {
        m=n;
        f=0;
        r=0;
        a = new int[m];
    }
    public void add_element(int x) {
        if (r == m) {
            System.out.println("Queue Overflow");
            return;
        }
        a[r]=x;
        System.out.println(x+" Added Successfully");
        r++;
    }
    public int delete_element() {
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
    /*incorrect version for delete element
    
    public int delete_element_incorrect() {
        if (r == 0) {
            System.out.println("Queue Underflow");
            return -9999;
        }
        int temp=a[f];
        f++;
        return temp;
    }
    
    */
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
public class Queue_App {
    public static void main(String args[]) {
        int x;
        Queue ob = new Queue(4);
        ob.display();
        System.out.println();
        for (int i=0;i<5;i++) {
            x = (int)(11*Math.random()+10);
            System.out.println("Trying To Insert "+x+" In The Queue");
            ob.add_element(x);
            ob.display();
            System.out.println();
        }
        for (int i=0;i<5;i++) {
            System.out.println("Trying To Delete Element From The Queue");
            x=ob.delete_element();
            if (x != -9999) {
                System.out.println(x+" Successfully Deleted");
            }
            ob.display();
            System.out.println();
        }
    }
}