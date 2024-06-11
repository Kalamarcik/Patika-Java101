import java.util.Scanner;

public class Main {

    static void sum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();

        int result = a + b;
        System.out.println("Result: " + result);
    }

    static void subtract() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();

        int result = a - b;
        System.out.println("Result: " + result);
    }

    static void multiply() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();

        int result = a * b;
        System.out.println("Result: " + result);
    }

    static void divide() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();

        if (b == 0) {
            System.out.println("You cannot enter zero as the divisor.");
        } else {
            int result = a / b;
            System.out.println("Result: " + result);
        }
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base number:");
        int a = scan.nextInt();
        System.out.println("Enter the exponent:");
        int b = scan.nextInt();

        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Result: " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scan.nextInt();

        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Result: " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for which you want to find the remainder:");
        int a = scan.nextInt();
        System.out.println("Enter the divisor:");
        int b = scan.nextInt();

        int result = a % b;
        System.out.println("Result: " + result);
    }

    static void calc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int a = scan.nextInt();
        System.out.println("Enter the width of the rectangle:");
        int b = scan.nextInt();

        int area = a * b;
        int perimeter = 2 * (a + b);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponentiation\n"
                + "6- Factorial\n"
                + "7- Modulus\n"
                + "8- Rectangle Area and Perimeter\n"
                + "0- Exit";

        while (true) {
            System.out.println(menu);
            System.out.println("Select an operation: ");
            select = scan.nextInt();
            if (select == 0) {
                System.out.println("Exiting the program...");
                break;
            }

            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    subtract();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    calc();
                    break;
                default:
                    System.out.println("Invalid selection! Please try again.");
            }
        }

        scan.close();
    }
}
