package OOPS_1.classes;

import java.util.ArrayList;

public class BankAccount {
    private double balance;
    private String ownerName;
    private ArrayList<String> transactionHistory = new ArrayList<>();

    public BankAccount() {
        this.balance = 0.0;
        this.ownerName = "Unknown";
        this.transactionHistory = new ArrayList<>();    
    }

    public BankAccount(double balance, String ownerName) {
        this.balance = balance;
        this.ownerName = ownerName;
        this.transactionHistory = new ArrayList<>();
        System.out.println("Account created for " + ownerName + " with initial balance: " + balance);    
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount);
        }
        System.out.println(ownerName + " deposited amount is " + amount + " and the new balance is " + balance);
    }
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: " + amount);
        }
        System.out.println(ownerName + " withdrew amount is " + amount + " and the new balance is " + balance);
    }

    public void printTransactionHistory() {
        for(String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    public void showBalance() {
        System.out.println(ownerName + "'s balance is " + balance);
    }
}
