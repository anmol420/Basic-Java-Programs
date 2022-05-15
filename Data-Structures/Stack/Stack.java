/*Basic Sample Of Stack Class*/

import java.util.*;
class Stack {
    private int arr[],size,top;
    public Stack(int x) {
        size = x;
        top=-1;
        arr=new int[size];
    }
    public void push(int x) {    
        top++;
        arr[top]=x;
    }
    public int pop() {
        int v;
        v = arr[top];
        top--;
        return v;
    }
    public void display() {
        for (int i=top;i>=0;i--) {
            System.out.println(arr[i]);
        }
    }
    public int peek() {
        return arr[top];
    }
    public boolean isfull() {
        return (top==(size-1));
    }
    public boolean isempty() {
        return (top==-1);
    }
}
