/*
Design  a  class  called  Student  with  the  following  members :
Data  members	:	Name ,  roll number  , marks  in  3  papers  and  grade  
Member  functions 	:
    a) to  assign  name  and  roll  number  using  a  constructer
    b) to  accept  the  three  marks  through  parameters
    c) to  display  all  data  members
    d) to  assign  the  grade

Grade  is  assigned  according  to  total  marks  on  the  following  basis :
	Total  marks 		Grade
270  and  above		  A
between  240 – 269		  B
between  210 – 239		  C
between  165 – 209		  D
between  120 – 164		  E
below  120			  F

Declare an object  and  call  the  required  methods .
*/
class student {
    private String name,grade;
    private int roll_number,eng,sci,comp;
    public student(String n,int roll) {
        name = n;
        roll_number = roll;
    }
    public void accept(int e,int s,int c) {
        eng = e;
        sci = s;
        comp = c;
    }
    public void display() {
        System.out.println("Details \n");
        System.out.println("Name - "+name);
        System.out.println("Roll Number - "+roll_number);
        System.out.println("\nMarks");
        System.out.println("English - "+eng);
        System.out.println("Science - "+sci);
        System.out.println("Computer - "+comp);
        System.out.println("\nGrade");
        System.out.println("Grade - "+grade);
    }
    public void grade() {
        int total = eng+sci+comp;
        if (total >= 270) 
        {
            grade = "A";
        }
        if (total >= 240 && total <= 269)
        {
            grade = "B";
        }
        if (total >= 210 && total <= 239)
        {
            grade = "C";
        }
        if (total >= 165 && total <= 209)
        {
            grade = "D";
        }
        if (total >= 120 && total <= 164)
        {
            grade = "E";
        }
        if (total < 120)
        {
            grade = "F";
        }
    }
}
public class Student {
    public static void main(String args[]) {
        student ob = new student("Anmol Anand",8);
        ob.accept(42,45,49);
        ob.grade();
        ob.display();
    }
}
