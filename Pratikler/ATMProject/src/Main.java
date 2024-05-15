import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int tries = 3;
        int select;
        int balance = 1500;
        int price;


        Scanner scan = new Scanner(System.in);

        while (tries > 0) {
            System.out.println("Username:");
            userName = scan.nextLine();
            System.out.println("Password:");
            password = scan.nextLine();

            if (Objects.equals(userName, "kalamarcik") && Objects.equals(password, "fish123")) {
                System.out.println("Hello, Welcome to the Ocean Bank");

                do {
                    System.out.println("1-Deposit Money\n" +
                            "2-Withdraw Money\n" +
                            "3-Check Balance\n" +
                            "4-Exit");
                    System.out.print("Please select the operation you want to do: ");
                    select = scan.nextInt();

                    if (select < 1 || select > 4) {
                        System.out.println("Invalid selection. Exiting the system.");
                        break;
                    }

                    switch (select) {
                        case 1:
                            System.out.print("Amount of money: ");
                            price = scan.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Amount of money: ");
                            price = scan.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Your balance: " + balance);
                            break;
                        case 4:
                            System.out.println("Thank you for using Ocean Bank.");
                            break;
                    }
                }
                while (select != 4);
                break;


            } else {
                tries--;
                System.out.println("Incorrect username or password. Please try again.");

                if (tries == 0) {
                    System.out.println("Your account has been blocked. Please contact the bank.");
                } else {
                    System.out.println("Remaining Attempts:" + tries);
                }
            }
        }
    }
}