package main;

import domain.Account;

import java.util.Scanner;

public class BankMov {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account(1234,5,"Arthur Silva", "987.654.321-00");
        int option = 0;
        double value = 0;

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
                    a.depositValue(sc.nextDouble());
                    Account.delay(2000);
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw: ");
                    if(a.withdrawValue(sc.nextDouble())){
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
