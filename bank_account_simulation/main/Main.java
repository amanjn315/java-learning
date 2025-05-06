package bank_account_simulation.main;

import java.util.Scanner;

import bank_account_simulation.bank.BankAccount;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(101, "Aman", 5000);

        int choice;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Show Info\n4. Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Amount to deposit: ");
                    account.deposit(sc.nextDouble());
                    break;
                
                case 2:
                    System.out.println("Amount to withdraw: ");
                    account.withdraw(sc.nextDouble());
                    break;

                case 3:
                    account.displayAccountInfo();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid option");
            }
        } while (choice != 4);
        sc.close();
    }
}
