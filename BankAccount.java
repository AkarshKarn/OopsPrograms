package OOPS;

import java.util.Scanner;

// Ques)  Write a Java program to create a class called "BankAccount" with instance variables "balance" and "accountNumber." Include a method to deposit money into the account and a method to withdraw money from the account.
public class BankAccount {

    static Scanner sc=new Scanner(System.in);
   private int accountNumber;
    int balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

//    public void getAc(){
//        System.out.println("The account number of the customer is:"+" "+accountNumber);
//    }

    public void getBalance(){
        System.out.println("The balance in the account number is:"+" "+balance);
    }

    public void deposit(){
        System.out.println("Enter the amount you want to deposit");
        double amount=sc.nextDouble();
        double dep=balance+amount;
        System.out.println("The final balance after deposit is:"+" "+dep);
    }

    public void withdraw(){
        System.out.println("Enter the amount you want to withdraw");
        double amount=sc.nextDouble();
        double wdraw=balance-amount;
        System.out.println("The final balance after deposit is:"+" "+wdraw);
    }

    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.setAccountNumber(12345);
        System.out.println("The account number is: "+bankAccount.getAccountNumber());
        bankAccount.balance=50000;
        bankAccount.getBalance();
        bankAccount.deposit();
        bankAccount.withdraw();

    }
}
