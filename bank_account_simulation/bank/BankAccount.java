package bank_account_simulation.bank;

public class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0) balance += amount;
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance or invalid amount.");
    }

    public void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }
}
