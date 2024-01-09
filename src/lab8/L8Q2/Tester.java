package lab8.L8Q2;

public class Tester {
    public static void main(String[] args) {
        BankAccount Account = new BankAccount("Ooi Wei Shen", "031214-07-0365", 10000);
        Account.deposit(100);
        Account.withdrawal(1000);
        Account.displayBalance();
    }
}
