/*
Create  a  class called  Clock  with  the  following  specifications :
Class  name 		:	Clock
Data  members	:	int   sec  (denotes seconds) 
Member  functions	:
Clock( )		initializes  sec  to  0
void tick( )		increments sec  by 1
void  showtime ( )	using  sec’s  value , displays  the  total time elapsed  in  hours , minutes  and  seconds  

In the  main( ) function , create  a  Clock  object .  Make  the  Clock  “tick”  10000  times . Then  display  the  time  elapsed .
*/
class clock {
    private int sec;
    public clock() {
        sec=0;
    }
    public void tick() {
        sec = sec + 1;
    }
    public void showtime() {
        System.out.println((sec/3600)+"hours "+((sec%3600)/60)+"minutes "+(sec-(((sec/3600)*3600)+(((sec%3600)/60)*60)))+"seconds");
    }
}
public class Clock {
    public static void main(String args[]) {
        clock ob = new clock();
        for (int i=0;i<10000;i++) {
            ob.tick();
        }
        ob.showtime();
    }
}
