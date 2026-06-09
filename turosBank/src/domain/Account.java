package domain;

public class Account {

    private int accountNumber;
    private int accountDigit;
    private String accountOwner;
    private String accountCpf;
    private double balance;

    public Account(int accountNumber, int accountDigit, String accountOwner, String accountCpf) {
        this.accountNumber = accountNumber;
        this.accountDigit = accountDigit;
        this.accountOwner = accountOwner;
        this.accountCpf = accountCpf;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountDigit() {
        return accountDigit;
    }

    public void setAccountDigit(int accountDigit) {
        this.accountDigit = accountDigit;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getAccountCpf() {
        return accountCpf;
    }

    public void setAccountCpf(String accountCpf) {
        this.accountCpf = accountCpf;
    }

    public void depositValue(double value) {
        if (value < 0){
            System.out.println("Invalid value. Please enter numbers greater than 0 for this operation.");
            return;
        }
        this.balance += value;
        System.out.println("Success, your deposit of $" + value + " has been added to the total." );
    }

    public boolean withdrawValue(double value) {
        if (value <= this.balance) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public String showInfo() {
        return "Account Number: " + this.accountNumber + "\n" +
               "Account Digit: " +  this.accountDigit + "\n" +
               "Account Owner: " +  this.accountOwner + "\n" +
               "Account CPF: " +    this.accountCpf + "\n" +
               "Account Balance: $" + this.balance;
    }

    public static void showMenu() {
        System.out.println("------ WELCOME TO TUROS BANK ------");
        System.out.println("--- PLEASE CHOOSE A OPTION BELOW ---");
        System.out.println("[1] Show info;");
        System.out.println("[2] Deposit;");
        System.out.println("[3] Withdraw;");
        System.out.println("[4] Exit.");
        System.out.print("Option: ");
    }

    public static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("Error on timer.");
        }
    }

}
