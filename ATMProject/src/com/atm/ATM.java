package com.atm;

import java.util.ArrayList;
import java.util.Date;

public class ATM {
    private double balance;
    private ArrayList<String> transactionHistory;

    public ATM() {
        balance = 0.0;
        transactionHistory = new ArrayList<>();
    }

    public void showTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transaction history available.");
        } else {
            System.out.println("Transaction History:");
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
            String transaction = "Withdraw: $" + amount + " on " + new Date();
            transactionHistory.add(transaction);
            System.out.println("Withdrawal successful. Current balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        balance += amount;
        String transaction = "Deposit: $" + amount + " on " + new Date();
        transactionHistory.add(transaction);
        System.out.println("Deposit successful. Current balance: $" + balance);
    }

    public void transfer(String recipientAccount, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
            String transaction = "Transfer: $" + amount + " to " + recipientAccount + " on " + new Date();
            transactionHistory.add(transaction);
            System.out.println("Transfer successful. Current balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
