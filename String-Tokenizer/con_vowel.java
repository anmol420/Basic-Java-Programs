import java.util.*;
class con_vowel {
    static boolean valid(String str) {
        if(!(str.endsWith(".")||str.endsWith("?"))) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Sentence");
        String sen = sc.nextLine();
        sen = sen.toUpperCase();
        if (!(valid(sen))) {
            System.out.println("Invalid Input");
            return;
        }
        StringTokenizer s = new StringTokenizer(sen);
        int con = 0,vow = 0;
        String stk = "";
        System.out.println("Word \t\t Vowels \t Consonants");
        while (s.hasMoreTokens()) {
            stk = s.nextToken();
            for (int i=0;i<stk.length();i++) {
                char ch = stk.charAt(i);
                if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                    vow++;
                } else {
                    con++;
                }
            }
            System.out.println(stk+"\t\t"+vow+"\t\t"+con);
            stk = "";
            vow=0;con=0;
        }
    }
}