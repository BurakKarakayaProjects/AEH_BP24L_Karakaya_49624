package pl.pp;

public class myEighthApp {
    // Private fields
    private String accountNumber;
    private double availableFunds;
    private String accountOwnerName;
    private String email;
    private String phoneNumber;

    // Constructor
    public myEighthApp(String accountNumber, double availableFunds, String accountOwnerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.availableFunds = availableFunds;
        this.accountOwnerName = accountOwnerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAvailableFunds() {
        return availableFunds;
    }

    public void setAvailableFunds(double availableFunds) {
        this.availableFunds = availableFunds;
    }

    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    public void setAccountOwnerName(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Method to credit the account
    public void credit(double amount) {
        if (amount > 0) {
            availableFunds += amount;
            System.out.println("Deposit of PLN " + amount + " was made. New balance PLN " + availableFunds);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= availableFunds) {
            availableFunds -= amount;
            System.out.println("Withdrew PLN " + amount + " from the account. Remaining balance = PLN " + availableFunds);
        } else if (amount > availableFunds) {
            System.out.println("Insufficient funds. You have PLN " + availableFunds + " in your account.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an account with initial funds
        myEighthApp myAccount = new myEighthApp("123456789", 1000.0, "John Doe", "john.doe@example.com", "123-456-7890");

        // Perform some operations on the account
        myAccount.withdraw(900.0);
        myAccount.credit(250.0);
        myAccount.withdraw(50.0);
        myAccount.withdraw(400.0);
    }
}

