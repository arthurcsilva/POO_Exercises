public class Account {

    private int accountNumber;
    private int accountDigit;
    private String accountOwner;
    private String accountCpf;
    private double balance;

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
        this.balance += value;
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
        // Note que não existe a palavra 'return' aqui!
    }

    public static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("Error on timer.");
        }
    }

}
