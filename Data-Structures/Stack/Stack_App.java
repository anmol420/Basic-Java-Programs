/*Application Class Of Class Stack*/

import java.util.*;
class Stack_App {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner dummy = new Scanner(System.in);
        System.out.println("Enter The Size Of The Stack");
        int n=sc.nextInt();
        Stack ob = new Stack(n);
        int ch;
        while (true) {
           System.out.println("\f"); //Works In BlueJ Editor Only Might Not Work On Any Other Editor
           System.out.println("Enter 1 For Pushing Into The Stack");
           System.out.println("Enter 2 For Poping Elements Out Of The Stack");
           System.out.println("Enter 3 For Displaying The Stack");
           System.out.println("Enter 4 For Quitting");
           System.out.println("Enter Your Choice - (1/2/3/4)?");
           ch = sc.nextInt();
           if (ch == 4) {
               break;
           }
           if (ch == 1) {
               if (ob.isfull()) {
                   System.out.println("Stack OverFlow");
               } else {
                   System.out.println("Enter The Element To Push Into The Stack");
                   int k=sc.nextInt();
                   ob.push(k);
                   System.out.println(k+" Pushed Successfully");
               }
           }
           else if (ch == 2) {
               if (ob.isempty()) {
                   System.out.println("Stack UnderFlow");
               } else {
                   int m=ob.pop();
                   System.out.println(m+" Popped From Stack Successfully");
               }
           }
           else if (ch == 3) {
               if (ob.isempty()) {
                   System.out.println("Stack UnderFlow !! The Stack Has Nothing Got In It !!");
               } else {
                   System.out.println("Stack Contents Are - ");
                   ob.display();
               }
           }
           else {
               System.out.println("Wrong Choice !!");
           }
           System.out.println("\n\nPress < Enter > To Continue");
           dummy.nextLine();
        }
        System.out.println("Program Funish");
    }
}
