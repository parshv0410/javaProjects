import java.util.Scanner;

class BankAccount {

    double balance = 1000;

    void deposit(double amount) {

        balance += amount;

        System.out.println("Amount Deposited Successfully");
    }

    void withdraw(double amount) {

        if(amount > balance) {

            System.out.println("Insufficient Balance");

        }

        else {

            balance -= amount;

            System.out.println("Withdrawal Successful");
        }
    }

    void showBalance() {

        System.out.println("Current Balance = " + balance);
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        while(true) {

            System.out.println("\n===== BANKING SYSTEM =====");

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter Deposit Amount: ");

                    double depositAmount = sc.nextDouble();

                    account.deposit(depositAmount);

                    break;

                case 2:

                    System.out.print("Enter Withdraw Amount: ");

                    double withdrawAmount = sc.nextDouble();

                    account.withdraw(withdrawAmount);

                    break;

                case 3:

                    account.showBalance();

                    break;

                case 4:

                    System.out.println("Thank You");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}
