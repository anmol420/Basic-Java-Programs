/*
Create  a  class   that  will  simulate  a  Counter  object  with  the  following  specifications :
Class  name 	        :	 Counter
Data  members       :	 int  count
Member  functions :
Counter( )		:	constructor  to  initialize  count
void  increase( )	:	to  increment  count  by  1
int  givecount( )	:	to  return  the  value  of  count
In  the  main\()  function  ,  create  two  Counter  objects.  Then  , using  these  two  objects , find  out  the  total  
number  of  students who  have  passed  and  failed  separately after  taking  the  marks  of  10  students  as  input . 
The  pass  mark  is  40 .
*/
import java.util.*;
class counter {
    private int count;
    public counter() {
        count = 0;
    }
    public void increase() {
        count+=1;
    }
    public int givecount() {
        return count;
    }
}
public class Counter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        counter ob = new counter();
        counter ob1 = new counter();
        int n;
        System.out.println("Enter The Marks Of 10 Students");
        for (int i=1;i<=10;i++)
        {
            n=sc.nextInt();
            if (n>=40)
            {
                ob.increase();
            }
            if (n<40)
            {
                ob1.increase();
            }
        }
        int c1 = ob.givecount();
        int c2 = ob1.givecount();
        System.out.println("Number Of Students Passed = "+c1);
        System.out.println("Number Of Students Failed = "+c2);
    }
}
