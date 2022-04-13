import java.util.*;
class encrypt {
    static boolean check(int n) {
        if (n<1 || n>10) {
            return false;
        }
        return true;
    }
    static String encryption(String s) {
        char ch;
        String temp="";
        int len=s.length();
        for(int x=0;x<len;x++) {
            ch=s.charAt(x);
            if((ch>=65 && ch<=90)||(ch>=97 && ch<=122)) {
                ch=(char)(ch+2);
                if(ch>90 && ch<97) {
                    ch=(char)((64+ch-90));
                } else if(ch>122) {
                    ch=(char)((96+ch-122));
                }
            }
            temp=temp+ch;
        }
        return temp;
    }
    static String reverse(String s){
        String rev="";
        for (int i=s.length()-1;i>=0;i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of String");
        int n=sc.nextInt();
        if (!check(n)) {
            System.out.println("Invalid Entry");
            return;
        }
        String str[] = new String[n];
        for (int i=0;i<n;i++) {
            str[i]=sc.nextLine();
        }
        System.out.println("Input");
        for (int i=0;i<n;i++) {
            System.out.println(str[i]);
        }
        for (int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(str[i]);
            String stk = "";
            while (st.hasMoreTokens()){
                stk = st.nextToken();
                if ((i+1)%2==0) {
                    str[i] = reverse(stk);
                } else {
                    str[i] = encryption(stk);
                }
                stk = "";
            }
        }
        System.out.println("Output");
        for (int i=0;i<n;i++) {
            System.out.println(str[i]);
        }
    }
}