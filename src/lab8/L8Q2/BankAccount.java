package lab8.L8Q2;

public class BankAccount {
    private String name;
    private String IC;
    private double balance;
    public BankAccount(String name, String IC , double balance){
        this.name = name;
        this.IC = IC;
        this.balance = balance;
    }

    void deposit(double deposit){
        balance+= deposit;
    }

    void withdrawal(double withdrawal){
        balance-=withdrawal;
    }

    public double getBalance() {
        return balance;
    }

    void displayBalance(){
        System.out.println("Name: "+name);
        System.out.println("IC or passport:  "+IC);
        System.out.printf("Current balance: %.2f",getBalance());
    }
}
