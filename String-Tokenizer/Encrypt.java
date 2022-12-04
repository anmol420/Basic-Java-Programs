import java.util.*;
class Encrypt {
    String wrd,newwrd;
    int len;
    Encrypt() {
        wrd = "";
        newwrd = "";
        len = 0;
    }
    void acceptword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        wrd = sc.nextLine();
        wrd = wrd.toUpperCase();
        len = wrd.length();
    }
    void freqvowcon() {
        int v=0,c=0;
        for (int i=0;i<len;i++) {
            char ch = wrd.charAt(i);
            if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                v++;
            }
            else {
                c++;
            }
        }
        System.out.println("The number of vowels is "+v);
        System.out.println("The number of consonants is "+c);
    }
    void nextVowel() {
        for (int i=0;i<len;i++) {
            char ch = wrd.charAt(i);
            if (ch == 'A') {
                newwrd = newwrd + "E";
            }
            else if (ch == 'E') {
                newwrd = newwrd + "I";
            }
            else if (ch == 'I') {
                newwrd = newwrd + "O";
            }
            else if (ch == 'O') {
                newwrd = newwrd + "U";
            }
            else if (ch == 'U') {
                newwrd = newwrd + "A";
            }
            else {
                newwrd = newwrd + ch;
            }
        }
    }
    void display() {
        System.out.println("\nOUTPUT:\n");
        System.out.println(wrd);
        System.out.println(newwrd);
    }
    public static void main(String args[]) {
        Encrypt obj = new Encrypt();
        obj.acceptword();
        obj.freqvowcon();
        obj.nextVowel();
        obj.display();
    }
}
