import java.util.Scanner;

public class BankMov {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();
        int option = 0;
        double value = 0;

        System.out.print("What is your account number? ");
        int accNumber = sc.nextInt();
        a.setAccountNumber(accNumber);

        System.out.print("What is your account digit? ");
        int accDigit = sc.nextInt();
        a.setAccountDigit(accDigit);

        sc.nextLine();

        System.out.print("What is your full name? ");
        String accOwner = sc.nextLine();
        a.setAccountOwner(accOwner);

        System.out.print("What is your CPF? ");
        String accCpf = sc.nextLine();
        a.setAccountCpf(accCpf);

        do {
            Account.showMenu();
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println(a.showInfo());
                    Account.delay(3000);
                    break;
                case 2:
                    System.out.println("How much do you want to deposit? ");
                    a.depositValue(value = sc.nextDouble());
                    System.out.println("Success, your deposit of $" + value + " has been added to the total." );
                    Account.delay(2000);
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw: ");
                    if(a.withdrawValue(value = sc.nextDouble())){
                        System.out.println("Success, your withdraw of $" + value + " has been processed.");
                    }else {
                        System.out.println("The entered amount is incorrect or exceeds the account balance.");
                    }
                    Account.delay(2000);
                    break;
                case 4:
                    System.out.println("Thank you, see you next time!");
                    Account.delay(1000);
                    break;
                default:
                    System.out.println("Wrong option, please, choose another one.");
                    Account.delay(3000);
            }
        } while (option != 4);

        sc.close();
    }
}
