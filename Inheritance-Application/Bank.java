import java.util.*;
class Bank {
    String name;
    long acc_no;
    double bal;
    Bank() {
        name = "";
        acc_no = 0;
        bal = 0.0;
    }
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        name = sc.nextLine();
        System.out.println("Enter the account number");
        acc_no = sc.nextInt();
        System.out.println("Enter the balance");
        bal = sc.nextDouble();
    }
    void display() {
        System.out.println("Name: "+name);
        System.out.println("Account number: "+acc_no);
        System.out.println("Balance: "+bal);
    }
}
class Interest extends Bank {
    double rate, time;
    Interest() {
        rate = 0.0;
        time = 0.0;
    }
    void accept() {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rate of interest");
        rate = sc.nextDouble();
        System.out.println("Enter the time");
        time = sc.nextDouble();
    }
    double calculate() {
        return bal * Math.pow((1 + rate / 100), time) - bal;
    }
    void display() {
        super.display();
        System.out.println("Rate of interest: "+rate);
        System.out.println("Time: "+time);
        double ci = calculate();
        System.out.println("Compound interest: "+ci);
    }
}