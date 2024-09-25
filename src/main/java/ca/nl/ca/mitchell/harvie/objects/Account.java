package ca.nl.ca.mitchell.harvie.objects;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if(balance >0){
            this.balance = balance;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * Deposit an amount into an account. Amount must be greater than 0
     * @param amount
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
