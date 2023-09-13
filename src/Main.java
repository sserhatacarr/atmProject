import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int attempts = 3; // Number of login attempts allowed
        int balance = 1500; // Initial account balance
        int choice;

        while (attempts > 0) {
            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to the X Bank!");
                do {
                    System.out.println("1-Deposit Money\n" +
                            "2-Withdraw Money\n" +
                            "3-Check Balance\n" +
                            "4-Exit");
                    System.out.print("Please select an operation: ");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.print("Amount to deposit: ");
                        int amount = input.nextInt();
                        balance += amount;
                    } else if (choice == 2) {
                        System.out.print("Amount to withdraw: ");
                        int amount = input.nextInt();
                        if (amount > balance) {
                            System.out.println("Insufficient balance.");
                        } else {
                            balance -= amount;
                        }
                    } else if (choice == 3) {
                        System.out.println("Your balance: " + balance);
                    }
                } while (choice != 4);
                System.out.println("Goodbye.");
                break;
            } else {
                attempts--;
                System.out.println("Incorrect username or password. Please try again.");
                if (attempts == 0) {
                    System.out.println("Your account is blocked. Please contact the bank.");
                } else {
                    System.out.println("Remaining attempts: " + attempts);
                }
            }
        }
    }
}
