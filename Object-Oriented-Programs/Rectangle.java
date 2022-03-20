/*
Create  a  Rectangle  class  with  the  following  specifications :
Class  name 		:	Rectangle
Data  members	:	length & width
Member functions :
Rectangle ( int x , int y ) :  to  initialize  data  members  via  parameters
void  display( )                :   to  display  the  length  &  width , along  with  the computed  area & perimeter
int givearea( )		     :  to compute & return the area 
int giveperi )         	     :  to compute & return the perimeter 
In  the  main( )  function , create  an  object  and  call  the  necessary  methods .
*/
class rectangle {
    private int length,width;
    public rectangle(int x,int y) {
        length = x;
        width = y;
    }
    public int givearea() {
        int area = length*width;
        return area;
    }
    public int giveperi() {
        int peri = 2*(length+width);
        return peri;
    }
}
public class Rectangle {
    public static void main(String args[]) {
        rectangle ob = new rectangle(2,3);
        int a=ob.givearea();
        int p=ob.giveperi();
        System.out.println("Area = "+a);
        System.out.println("Perimeter = "+p);
    }
}
