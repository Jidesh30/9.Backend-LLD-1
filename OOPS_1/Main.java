package OOPS_1;

import OOPS_1.classes.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(10000.0, "Alice");

        myAccount.deposit(54.50);
        myAccount.showBalance();

        myAccount.withdraw(200.0);
        myAccount.showBalance(); 
        myAccount.deposit(100);
        myAccount.deposit(150);
        myAccount.withdraw(5000);
        myAccount.deposit(53);
        myAccount.printTransactionHistory();
        myAccount.showBalance();
    }
}
