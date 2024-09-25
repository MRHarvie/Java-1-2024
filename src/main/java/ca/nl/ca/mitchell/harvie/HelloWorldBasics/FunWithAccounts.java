package ca.nl.ca.mitchell.harvie.HelloWorldBasics;

import ca.nl.ca.mitchell.harvie.objects.Account;

import java.util.Scanner;

public class FunWithAccounts {

    public static void main(String[] args) {
        System.out.println("Fun With Accounts!");

        Account account = new Account("Harv's Account", 1567.23);

        System.out.printf("\nAccount name: %s, Balance:  $%.2f", account.getName(), account.getBalance());
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter an amount to deposit:  ");
        double amount = input.nextDouble();
        account.deposit(amount);
        System.out.printf("\nAccount name: %s, Balance: $%.2f", account.getName(), account.getBalance());
    }
}
