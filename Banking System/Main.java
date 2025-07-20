import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = null;

        System.out.println("Welcome to Java Bank!");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();

        System.out.println("Choose account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int choice = sc.nextInt();

        if (choice == 1) {
            account = new SavingsAccount(name, accNumber);
        } else if (choice == 2) {
            account = new CurrentAccount(name, accNumber);
        } else {
            System.out.println("Invalid choice!");
            System.exit(0);
        }

        int option;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Details");
            System.out.println("4. Show Account Type");
            System.out.println("5. Exit");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 3:
                    account.showDetails();
                    break;

                case 4:
                    account.accountType();
                    break;

                case 5:
                    System.out.println("Thank you for banking with us!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 5);
        
        sc.close();
    }
}
